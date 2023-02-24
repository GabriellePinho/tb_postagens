package com.senacniteroi.blogpessoal.controller;

@RestController
@RequestMapping("/postagens")
@CrossOrigin( origins = "*", allowedHeaders = "*")
public class PostagemController {

@Autowired

private PostagemRespository postagemRepository;

@GetMapping
public ResponseEntity <List <Postagem>> GetAll (){
	return ResponseEntity.Ok (postagemRepository.FindAll());
}
	
}
