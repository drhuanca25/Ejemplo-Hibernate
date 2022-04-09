package com.ejemplo1.hibernateSimple1;

public class FuncionesGroupBy {
	private int id;
	private long conteo;
	private float max, min;
	private double sum, media;
	public FuncionesGroupBy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FuncionesGroupBy(int id, long conteo, float max, float min, double sum, double media) {
		super();
		this.id = id;
		this.conteo = conteo;
		this.max = max;
		this.min = min;
		this.sum = sum;
		this.media = media;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getConteo() {
		return conteo;
	}
	public void setConteo(long conteo) {
		this.conteo = conteo;
	}
	public float getMax() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
	}
	public float getMin() {
		return min;
	}
	public void setMin(float min) {
		this.min = min;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	

}
