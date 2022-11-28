function CadastrarProduto(){
        produtos = {};
        produtos.descricao = document.getElementById("txtDescricao").value;
        produtos.vaor = document.getElementById("valor").value;
      
    
        axios.post("http://localhost:8080/Produtos", produtos)
        .then(function (response) {
            limparFormulario();
        })
        .catch(function (error) {
    
        });
    }
