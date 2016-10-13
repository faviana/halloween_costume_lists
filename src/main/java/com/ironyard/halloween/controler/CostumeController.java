package com.ironyard.halloween.controler;

import com.ironyard.halloween.data.Costume;
import com.ironyard.halloween.repositories.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by favianalopez on 10/12/16.
 */
@RestController
public class CostumeController {

    private CostumeRepository costumeRepository;

    @Autowired
    public void setCostumeRepository (CostumeRepository cRepository){
        this.costumeRepository = cRepository;
    }

    /**
     * Get all list<Costume>
     * @return returns all the object items found
     */
    @RequestMapping (value = "/halloween", method = RequestMethod.GET)
    public Iterable<Costume> listCostumes (){
        return costumeRepository.findAll();
    }

    /**
     * get attribute by id
     * @param id
     * @return
     */
    @RequestMapping (value = "/halloween/{id}", method = RequestMethod.GET)
    public Costume show (@PathVariable Long id){
        return costumeRepository.findOne(id);
    }

    /**
     * updates the attributes by their id
     * @param costume
     * @return
     */
    @RequestMapping (value = "halloween/update", method = RequestMethod.PUT)
    public Costume update (@RequestBody Costume costume){
        costumeRepository.save(costume);
        return costumeRepository.findOne(costume.getId());
    }

    /**
     * finds attribute by id
     * saves attribute
     * @param costume
     * @return returns found attribute tha was saved
     */
    @RequestMapping (value = "/halloween", method = RequestMethod.POST)
    public Costume save (@RequestBody Costume costume){
        costumeRepository.save(costume);
        return costumeRepository.findOne(costume.getId());
    }

    /**
     * finds attribute by id
     * deletes attribute
     * @param id
     * @return
     */
    @RequestMapping (value ="/halloween/delete/{id}", method = RequestMethod.DELETE)
    public Costume delete (@PathVariable Long id){
        Costume deleted = costumeRepository.findOne(id);
        costumeRepository.delete(id);
        return deleted;
    }


}
