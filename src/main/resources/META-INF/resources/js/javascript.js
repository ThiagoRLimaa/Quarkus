function cadastrar() {
    
    presenca.codpessoa = document.getElementById("txtNome").value;
    presenca.nomecurso = document.getElementById("TxtCpf").value;

    axios.post("http://localhost:8080/pessoa", pessoa)
    .then(function (response) {
        alert("Cadastro realizado com sucesso");        
    })
    .catch(function (error) {
        alert("Cadastro não efetuado");     

    });    
}

function InserirSelect(){
    axios.get('http://localhost:8080/presenca/',{})
    .then(function (response) {
        preencherSelect(response.data);
        })
}


function preencherSelect(dados){
    let selectTabela = document.getElementById("selecionar");
    selectTabela.options = [];
    selectTabela.options.length = 0;
    option = new Option("Selecione o Item",null);
    selectTabela.options[selectTabela.options.length] = option
    dados.forEach((presenca) => {
        option = new Option(presenca.CODPESSOA, presenca.CODPESSOA);
        selectTabela.options[selectTabela.options.length] = option;
    });
   
}