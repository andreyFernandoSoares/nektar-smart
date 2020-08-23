package br.com.nektar.smart.Nektar.Smart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String videoPath;
	private String image;
	private Integer imageOrder;
	private String skillsPack;
	
	public Skill() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getImageOrder() {
		return imageOrder;
	}

	public void setImageOrder(Integer imageOrder) {
		this.imageOrder = imageOrder;
	}

	public String getSkillsPack() {
		return skillsPack;
	}

	public void setSkillsPack(String skillsPack) {
		this.skillsPack = skillsPack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((imageOrder == null) ? 0 : imageOrder.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skillsPack == null) ? 0 : skillsPack.hashCode());
		result = prime * result + ((videoPath == null) ? 0 : videoPath.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (imageOrder == null) {
			if (other.imageOrder != null)
				return false;
		} else if (!imageOrder.equals(other.imageOrder))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skillsPack == null) {
			if (other.skillsPack != null)
				return false;
		} else if (!skillsPack.equals(other.skillsPack))
			return false;
		if (videoPath == null) {
			if (other.videoPath != null)
				return false;
		} else if (!videoPath.equals(other.videoPath))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", videoPath=" + videoPath + ", image=" + image + ", imageOrder="
				+ imageOrder + ", skillsPack=" + skillsPack + "]";
	}
}
