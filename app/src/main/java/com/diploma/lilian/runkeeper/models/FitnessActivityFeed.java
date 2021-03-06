package com.diploma.lilian.runkeeper.models;

import java.util.Arrays;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class FitnessActivityFeed {
	
	@JsonSerialize(include = Inclusion.NON_NULL)
	public static class Item {
		private String type; //The type of activity, as one of the following values: "Running", "Cycling", "Mountain Biking", "Walking", "Hiking", "Downhill Skiing", "Cross-Country Skiing", "Snowboarding", "Skating", "Swimming", "Wheelchair", "Rowing", "Elliptical", "Other"
		private String start_time; //The starting time for the activity (e.g., "Sat, 1 Jan 2011 00:00:00")
		private Integer utc_offset; //The URI of the detailed information for the past activity
		private Double total_distance; //The total distance for the activity, in meters
		private Double duration; //The duration of the activity, in seconds
		private Double total_calories; //The total distance for the activity, in meters
		private String source; //The URI of the detailed information for the past activity
		private String entry_mode; //The URI of the detailed information for the past activity
		private String tracking_mode; //The URI of the detailed information for the past activity
		private Boolean has_path; //The URI of the detailed information for the past activity
		private String uri; //The URI of the detailed information for the past activity

		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getEntry_mode() {
			return entry_mode;
		}
		public void setEntry_mode(String entry_mode) {
			this.entry_mode = entry_mode;
		}
		public String getTracking_mode() {
			return tracking_mode;
		}
		public void setTracking_mode(String tracking_mode) {
			this.tracking_mode = tracking_mode;
		}
		public Boolean getHas_path() {
			return has_path;
		}
		public void setHas_path(Boolean has_path) {
			this.has_path = has_path;
		}
		public Double getTotal_calories() {
			return total_calories;
		}
		public void setTotal_calories(Double total_calories) {
			this.total_calories = total_calories;
		}
		public Integer getUtc_offset() {
			return utc_offset;
		}
		public void setUtc_offset(Integer utc_offset) {
			this.utc_offset = utc_offset;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getStart_time() {
			return start_time;
		}
		public void setStart_time(String start_time) {
			this.start_time = start_time;
		}
		public Double getTotal_distance() {
			return total_distance;
		}
		public void setTotal_distance(Double total_distance) {
			this.total_distance = total_distance;
		}
		public Double getDuration() {
			return duration;
		}
		public void setDuration(Double duration) {
			this.duration = duration;
		}
		public String getUri() {
			return uri;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		
		@Override
		public String toString() {
			return "Item [_type=" + type + ", _start_time=" + start_time
					+ ", _total_distance=" + total_distance + ", _duration="
					+ duration + ", _uri=" + uri + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((duration == null) ? 0 : duration.hashCode());
			result = prime * result
					+ ((start_time == null) ? 0 : start_time.hashCode());
			result = prime
					* result
					+ ((total_distance == null) ? 0 : total_distance
							.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			result = prime * result + ((uri == null) ? 0 : uri.hashCode());
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
			Item other = (Item) obj;
			if (duration == null) {
				if (other.duration != null)
					return false;
			} else if (!duration.equals(other.duration))
				return false;
			if (start_time == null) {
				if (other.start_time != null)
					return false;
			} else if (!start_time.equals(other.start_time))
				return false;
			if (total_distance == null) {
				if (other.total_distance != null)
					return false;
			} else if (!total_distance.equals(other.total_distance))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			if (uri == null) {
				if (other.uri != null)
					return false;
			} else if (!uri.equals(other.uri))
				return false;
			return true;
		}
	}
	
	private Integer size; //The total number of fitness activities across all pages;
	private Item[] items; //The user's activities, from newest to oldest
	private String previous; //The URI of the previous page in the user's feed (omitted for the oldest page)
	private String next; 	//The URI of the next page in the user's feed (omitted for the newest page)
	
	public FitnessActivityFeed() {
		
	}
	
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "FitnessActivityFeed [_size=" + size + ", _items="
				+ Arrays.toString(items) + ", _previous=" + previous
				+ ", _next=" + next + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(items);
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result
				+ ((previous == null) ? 0 : previous.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		FitnessActivityFeed other = (FitnessActivityFeed) obj;
		if (!Arrays.equals(items, other.items))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}
}
