package com.practice.designpatterns.builder;

class Offer {
	
	private String offerId;
	
	private String offerName;

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	
}

class OfferBuilder {
	
	Offer offer = new Offer();
	
	OfferIdBuilder setId() {
		return new OfferIdBuilder(offer);
	}
	
	
	OfferNameBuilder setName() {
		return new OfferNameBuilder(offer);
	}
	
	Offer build() {
		return offer;
	}
	
}

class OfferIdBuilder extends OfferBuilder{
	
	public OfferIdBuilder(Offer offer) {
		this.offer=offer;
	}
	
	public OfferIdBuilder id(String id) {
		offer.setOfferId(id);
		return this;
	}
}

class OfferNameBuilder extends OfferBuilder{
	
	public OfferNameBuilder(Offer offer) {
		this.offer = offer;
	}
	
	public OfferNameBuilder name(String name) {
		offer.setOfferName(name);
		return this;
	}
	
}

public class BuilderFacadeDemo {

	public static void main(String[] args) {
		
		Offer offer = new OfferBuilder().setId()
							.id("123")
						  .setName()
						  	.name("credit")
						  .build();
		
		System.out.println(offer.getOfferId() + " " + offer.getOfferName());
	}
	
}
