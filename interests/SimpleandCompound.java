package interests;

public class SimpleandCompound implements Interest {
	float principal;
	float time;
	float rate;
	public SimpleandCompound(float p,float t,float r) {
		principal=p;
		time=t;
		rate=r;
	}

	@Override
	public double sim() {
		// TODO Auto-generated method stub
		return (principal*time*rate)/100;
	}

	@Override
	public double comp() {
		// TODO Auto-generated method stub
		return (principal *(Math.pow((1+rate)/100, time)));
}

}
