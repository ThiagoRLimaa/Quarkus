function CadastrarProduto(){
  Produtos = {};
  Produtos.id = document.getElementById("txtId").value;
  Produtos.descricao = document.getElementById("txtDescricao").value;
  Produtos.valor = document.getElementById("txtvalor").value;

  axios.post("http://localhost:8080/produtos", Produtos)
  .then(function (response) {
  })
  .catch(function (error) {

  });

  alert("Cadastro realizado com sucesso");
}