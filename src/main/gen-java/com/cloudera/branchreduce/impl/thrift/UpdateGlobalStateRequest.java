/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.cloudera.branchreduce.impl.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateGlobalStateRequest implements org.apache.thrift.TBase<UpdateGlobalStateRequest, UpdateGlobalStateRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateGlobalStateRequest");

  private static final org.apache.thrift.protocol.TField GLOBAL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("globalState", org.apache.thrift.protocol.TType.STRING, (short)1);

  public ByteBuffer globalState;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GLOBAL_STATE((short)1, "globalState");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GLOBAL_STATE
          return GLOBAL_STATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GLOBAL_STATE, new org.apache.thrift.meta_data.FieldMetaData("globalState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateGlobalStateRequest.class, metaDataMap);
  }

  public UpdateGlobalStateRequest() {
  }

  public UpdateGlobalStateRequest(
    ByteBuffer globalState)
  {
    this();
    this.globalState = globalState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateGlobalStateRequest(UpdateGlobalStateRequest other) {
    if (other.isSetGlobalState()) {
      this.globalState = org.apache.thrift.TBaseHelper.copyBinary(other.globalState);
;
    }
  }

  public UpdateGlobalStateRequest deepCopy() {
    return new UpdateGlobalStateRequest(this);
  }

  @Override
  public void clear() {
    this.globalState = null;
  }

  public byte[] getGlobalState() {
    setGlobalState(org.apache.thrift.TBaseHelper.rightSize(globalState));
    return globalState == null ? null : globalState.array();
  }

  public ByteBuffer bufferForGlobalState() {
    return globalState;
  }

  public UpdateGlobalStateRequest setGlobalState(byte[] globalState) {
    setGlobalState(globalState == null ? (ByteBuffer)null : ByteBuffer.wrap(globalState));
    return this;
  }

  public UpdateGlobalStateRequest setGlobalState(ByteBuffer globalState) {
    this.globalState = globalState;
    return this;
  }

  public void unsetGlobalState() {
    this.globalState = null;
  }

  /** Returns true if field globalState is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobalState() {
    return this.globalState != null;
  }

  public void setGlobalStateIsSet(boolean value) {
    if (!value) {
      this.globalState = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GLOBAL_STATE:
      if (value == null) {
        unsetGlobalState();
      } else {
        setGlobalState((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GLOBAL_STATE:
      return getGlobalState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GLOBAL_STATE:
      return isSetGlobalState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateGlobalStateRequest)
      return this.equals((UpdateGlobalStateRequest)that);
    return false;
  }

  public boolean equals(UpdateGlobalStateRequest that) {
    if (that == null)
      return false;

    boolean this_present_globalState = true && this.isSetGlobalState();
    boolean that_present_globalState = true && that.isSetGlobalState();
    if (this_present_globalState || that_present_globalState) {
      if (!(this_present_globalState && that_present_globalState))
        return false;
      if (!this.globalState.equals(that.globalState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UpdateGlobalStateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UpdateGlobalStateRequest typedOther = (UpdateGlobalStateRequest)other;

    lastComparison = Boolean.valueOf(isSetGlobalState()).compareTo(typedOther.isSetGlobalState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobalState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globalState, typedOther.globalState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // GLOBAL_STATE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.globalState = iprot.readBinary();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.globalState != null) {
      oprot.writeFieldBegin(GLOBAL_STATE_FIELD_DESC);
      oprot.writeBinary(this.globalState);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UpdateGlobalStateRequest(");
    boolean first = true;

    sb.append("globalState:");
    if (this.globalState == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.globalState, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

