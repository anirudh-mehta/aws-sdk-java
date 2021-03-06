/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A group of reservations that share a set of attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationCoverageGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationCoverageGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     */
    private Coverage coverage;

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @return The attributes for this group of reservations.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @param attributes
     *        The attributes for this group of reservations.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * 
     * @param attributes
     *        The attributes for this group of reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationCoverageGroup withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public ReservationCoverageGroup addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationCoverageGroup clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     * 
     * @param coverage
     *        How much instance usage this group of reservations covered.
     */

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     * 
     * @return How much instance usage this group of reservations covered.
     */

    public Coverage getCoverage() {
        return this.coverage;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     * 
     * @param coverage
     *        How much instance usage this group of reservations covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationCoverageGroup withCoverage(Coverage coverage) {
        setCoverage(coverage);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCoverage() != null)
            sb.append("Coverage: ").append(getCoverage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationCoverageGroup == false)
            return false;
        ReservationCoverageGroup other = (ReservationCoverageGroup) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCoverage() == null ^ this.getCoverage() == null)
            return false;
        if (other.getCoverage() != null && other.getCoverage().equals(this.getCoverage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCoverage() == null) ? 0 : getCoverage().hashCode());
        return hashCode;
    }

    @Override
    public ReservationCoverageGroup clone() {
        try {
            return (ReservationCoverageGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationCoverageGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
