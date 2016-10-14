function valida(aForm){

if (aForm.oNome.value == "") 
{
 alert("É obrigatório informar o NOME");
 aForm.oNome.focus();
 return (false);
}
 
if (aForm.oFone.value == "") 
{
 alert("É obrigatório informar o TELEFONE");
 aForm.oFone.focus();
 return (false);
}

if (aForm.oIdade.value == "") 
 {    
  alert("É obrigatório informar o IDADE");
  aForm.oIdade.focus();
  return (false);
 }
 
if (aForm.oCep.value == "") 
 {    
  alert("É obrigatório informar o CEP");
  aForm.oCep.focus();
  return (false);
 }

if (aForm.oEmail.value == "")
{
 alert("É obrigatório informar o EMAIL");
 aForm.oEmail.focus();
 return (false);
}

if (aForm.oCpf.value == "") 
 {    
  alert("É obrigatório informar o CPF");
  aForm.oCpf.focus();
  return (false);
 }
 
if (aForm.oRg.value == "") 
 {    
  alert("É obrigatório informar o RG");
  aForm.oRg.focus();
  return (false);
 }
 
 if (aForm.oEndereco.value == "") 
 {    
  alert("É obrigatório informar o ENDEREÇO");
  aForm.oEndereco.focus();
  return (false);
 }
 
 if (aForm.oCidade.value == "") 
 {    
  alert("É obrigatório informar a CIDADE");
  aForm.oCidade.focus();
  return (false);
 }
 
 if (aForm.oEstado.value == "") 
 {    
  alert("É obrigatório informar o ESTADO");
  aForm.oEstado.focus();
  return (false);
 }
 
 if (aForm.oPais.value == "") 
 {    
  alert("É obrigatório informar o PAIS");
  aForm.oPais.focus();
  return (false);
 }
 
 if (aForm.oEscolaridade.value == "") 
 {    
  alert("Informe qual a sua ESCOLARIDADE");
  aForm.oEscolaridade.focus();
  return (false);
 }
 
 if (aForm.oEscolas.value == "") 
 {    
  alert("Você estou em quais ESCOLAS?");
  aForm.oEscolas.focus();
  return (false);
 }
 
 var contato = new Object();
 contato.nome = aForm.oNome.value;
 contato.telefone = aForm.oFone.value;
 contato.idade = aForm.oIdade.value;
 contato.cep = aForm.oCep.value;
 contato.email = aForm.oEmail.value;
 contato.cpf = aForm.oCpf.value;
 contato.rg = aForm.oRg.value;
 contato.endereco = aForm.oEndereco.value;
 contato.bairro = aForm.oBairro.value;
 contato.cidade = aForm.oCidade.value;
 contato.estado = aForm.oEstado.value;
 contato.pais = aForm.oPais.value;
 contato.escolaridade = aForm.oEscolaridade.value;
 contato.escolas = aForm.oEscolas.value;
 
 var msg = "Cadastro concluído com sucesso!!!!\nNome - " + contato.nome + "\nEmail - " + contato.email;
 
 alert(msg);
 
 return (true);
 
}
