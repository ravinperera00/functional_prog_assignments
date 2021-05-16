object tute1_19001126_3 extends App{
	
	def price(cp:Double):Double={
		
		if(cp > 50)
		{
			return 24.95*cp - (24.95*cp/100)*40 + 50*3 + (cp-50)*0.75;
		}else
		{
			return 24.95*cp - (24.95*cp/100)*40 + cp*3;
		}
		
	}
	
	println(price(60))
}