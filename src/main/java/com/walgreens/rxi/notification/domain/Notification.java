package com.walgreens.rxi.notification.domain;

import com.walgreens.rxi.notification.domain.enumeration.NotificationType;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import javax.validation.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Notification.
 */
@Document(collection = "notification")
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("date")
    private Instant date;

    @NotNull
    @Field("sent_date")
    private Instant sentDate;

    @NotNull
    @Field("format")
    private NotificationType format;

    @NotNull
    @Field("user_id")
    private Long userId;

    @NotNull
    @Field("location_number")
    private UUID locationNumber;

    @NotNull
    @Field("location_code")
    private UUID locationCode;

    @Field("details")
    private String details;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Notification id(String id) {
        this.id = id;
        return this;
    }

    public Instant getDate() {
        return this.date;
    }

    public Notification date(Instant date) {
        this.date = date;
        return this;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Instant getSentDate() {
        return this.sentDate;
    }

    public Notification sentDate(Instant sentDate) {
        this.sentDate = sentDate;
        return this;
    }

    public void setSentDate(Instant sentDate) {
        this.sentDate = sentDate;
    }

    public NotificationType getFormat() {
        return this.format;
    }

    public Notification format(NotificationType format) {
        this.format = format;
        return this;
    }

    public void setFormat(NotificationType format) {
        this.format = format;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Notification userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UUID getLocationNumber() {
        return this.locationNumber;
    }

    public Notification locationNumber(UUID locationNumber) {
        this.locationNumber = locationNumber;
        return this;
    }

    public void setLocationNumber(UUID locationNumber) {
        this.locationNumber = locationNumber;
    }

    public UUID getLocationCode() {
        return this.locationCode;
    }

    public Notification locationCode(UUID locationCode) {
        this.locationCode = locationCode;
        return this;
    }

    public void setLocationCode(UUID locationCode) {
        this.locationCode = locationCode;
    }

    public String getDetails() {
        return this.details;
    }

    public Notification details(String details) {
        this.details = details;
        return this;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Notification)) {
            return false;
        }
        return id != null && id.equals(((Notification) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Notification{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", sentDate='" + getSentDate() + "'" +
            ", format='" + getFormat() + "'" +
            ", userId=" + getUserId() +
            ", locationNumber='" + getLocationNumber() + "'" +
            ", locationCode='" + getLocationCode() + "'" +
            ", details='" + getDetails() + "'" +
            "}";
    }
}
