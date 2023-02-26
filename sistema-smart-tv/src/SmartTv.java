public class SmartTv{
        boolean ligada = false;
        int canal = 1;
        int volume = 20;

        public void ligar(){
            if (this.ligada == false){
                this.ligada = true;
                System.out.println("TV ligada!");
            }else
                System.out.println("TV já está ligada!");     
        }

        public void desligar(){
            if (this.ligada == true){
                this.ligada = false;
                System.out.println("TV desligada!"); 
            }else
                System.out.println("TV já está desligada!");     
        }
        
        public void aumentarVolume(){
            if (this.ligada == true){
                this.volume++;
            }else
                System.out.println("TV está desligada, não é possivel aumentar volume!");            
        }

        public void diminuirVolume(){
            if (this.ligada == true){
                this.volume--;
            }else
                System.out.println("TV está desligada, não é possivel diminuir volume!");
        }

        public void aumentarCanal(){
            if (this.ligada == true){
                this.canal++;
            }else
                System.out.println("TV está desligada, não é possivel aumentar Canal!");            
        }

        public void diminuirCanal(){
            if (this.ligada == true){
                this.canal--;
            }else
                System.out.println("TV está desligada, não é possivel diminuir Canal!");
        }

        public String toString(){
            return "Ligada: "+this.ligada+" volume: "+this.volume+" canal: "+this.canal;
        }

}
