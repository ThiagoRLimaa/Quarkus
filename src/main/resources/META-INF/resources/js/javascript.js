function CadastrarProduto(){
        produtos = {};
        produtos.descricao = document.getElementById("txtDescricao").value;
        produtos.valor = document.getElementById("txtvalor").value;
      
    
        axios.post("http://localhost:8080/Produtos", produtos)
        .then(function (response) {
            limparFormulario();
        })
        .catch(function (error) {
    
        });
    }
