package main.java.br.com.domain.entity;

public class pessoa {

    public static void main(String[] args) {

        //construtor
        private string Nomecompleto;

        private date Datadenascimento;

        private integer CpfCnpj;

        private integer Ctps;

        //getters
        public string getNomecompleto () {
            return Nomecompleto;
        }
        public date getDatadenascimento () {
            return Datadenascimento;
        }
        public integer getCpfCnpj () {
            return CpfCnpj;
        }
        public integer getCtps () {
            return Ctps;
        }
        //setters
        public void setNomecompleto (string Nomecompleto){
            this.nomecompleto = Nomecompleto;
        }
        public void setDatadenascimento (date Datadenascimento){
            this.datadenascimento = Datadenascimento;
        }
        public void setCpfCnpj (integer cpfCnpj){
            this.CpfCnpj = CpfCnpj;
        }
        public void setCtps (integer Ctps){
            this.Ctps = Ctps;
        }
    }
}


