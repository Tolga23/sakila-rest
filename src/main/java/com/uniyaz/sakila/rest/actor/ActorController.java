package com.uniyaz.sakila.rest.actor;

import com.uniyaz.sakila.core.actor.*;
import com.uniyaz.sakila.rest.BaseController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "actor")
public class ActorController extends BaseController<Actor, ActorService>{


}
