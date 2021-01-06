

	// Add your code here
    Difference(int[] elements){
        this.elements = elements;
        this.maximumDifference =0;
    }


    public void computeDifference(){
        for(int i=0; i<this.elements.length-1; i++){
            for(int j=i+1; j< this.elements.length; j++){
                if(Math.abs(this.elements[i] - this.elements[j]) > this.maximumDifference){
                    this.maximumDifference = Math.abs(this.elements[i] - this.elements[j]);
                }
            }
        }
    }
