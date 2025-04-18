package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d2 extends b2 {
    @Override // com.google.protobuf.b2
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((l3) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.b2
    public Object findExtensionByNumber(a2 a2Var, o5 o5Var, int i10) {
        return a2Var.findLiteExtensionByNumber(o5Var, i10);
    }

    @Override // com.google.protobuf.b2
    public x2 getExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.b2
    public x2 getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.b2
    public boolean hasExtensions(o5 o5Var) {
        return o5Var instanceof GeneratedMessageLite$ExtendableMessage;
    }

    @Override // com.google.protobuf.b2
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.b2
    public <UT, UB> UB parseExtension(Object obj, t6 t6Var, Object obj2, a2 a2Var, x2 x2Var, UB ub2, s8 s8Var) throws IOException {
        Object valueOf;
        Object field;
        ArrayList arrayList;
        m3 m3Var = (m3) obj2;
        int number = m3Var.getNumber();
        if (m3Var.descriptor.isRepeated() && m3Var.descriptor.isPacked()) {
            switch (c2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m3Var.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ((t0) t6Var).readEnumList(arrayList);
                    ub2 = (UB) b7.filterUnknownEnumList(obj, number, arrayList, m3Var.descriptor.getEnumType(), ub2, s8Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + m3Var.descriptor.getLiteType());
            }
            x2Var.setField(m3Var.descriptor, arrayList);
        } else {
            if (m3Var.getLiteType() == t9.ENUM) {
                int readInt32 = ((t0) t6Var).readInt32();
                if (m3Var.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                    return (UB) b7.storeUnknownEnum(obj, number, readInt32, ub2, s8Var);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (c2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m3Var.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(((t0) t6Var).readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(((t0) t6Var).readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(((t0) t6Var).readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(((t0) t6Var).readUInt64());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(((t0) t6Var).readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(((t0) t6Var).readFixed64());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(((t0) t6Var).readFixed32());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(((t0) t6Var).readBool());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(((t0) t6Var).readUInt32());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(((t0) t6Var).readSFixed32());
                        break;
                    case 11:
                        valueOf = Long.valueOf(((t0) t6Var).readSFixed64());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(((t0) t6Var).readSInt32());
                        break;
                    case 13:
                        valueOf = Long.valueOf(((t0) t6Var).readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = ((t0) t6Var).readBytes();
                        break;
                    case 16:
                        valueOf = ((t0) t6Var).readString();
                        break;
                    case 17:
                        if (!m3Var.isRepeated()) {
                            Object field2 = x2Var.getField(m3Var.descriptor);
                            if (field2 instanceof o3) {
                                z6 schemaFor = p6.getInstance().schemaFor((p6) field2);
                                if (!((o3) field2).isMutable()) {
                                    Object newInstance = schemaFor.newInstance();
                                    schemaFor.mergeFrom(newInstance, field2);
                                    x2Var.setField(m3Var.descriptor, newInstance);
                                    field2 = newInstance;
                                }
                                ((t0) t6Var).mergeGroupField(field2, schemaFor, a2Var);
                                return ub2;
                            }
                        }
                        valueOf = ((t0) t6Var).readGroup(m3Var.getMessageDefaultInstance().getClass(), a2Var);
                        break;
                    case 18:
                        if (!m3Var.isRepeated()) {
                            Object field3 = x2Var.getField(m3Var.descriptor);
                            if (field3 instanceof o3) {
                                z6 schemaFor2 = p6.getInstance().schemaFor((p6) field3);
                                if (!((o3) field3).isMutable()) {
                                    Object newInstance2 = schemaFor2.newInstance();
                                    schemaFor2.mergeFrom(newInstance2, field3);
                                    x2Var.setField(m3Var.descriptor, newInstance2);
                                    field3 = newInstance2;
                                }
                                ((t0) t6Var).mergeMessageField(field3, schemaFor2, a2Var);
                                return ub2;
                            }
                        }
                        valueOf = ((t0) t6Var).readMessage(m3Var.getMessageDefaultInstance().getClass(), a2Var);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (m3Var.isRepeated()) {
                x2Var.addRepeatedField(m3Var.descriptor, valueOf);
            } else {
                int i10 = c2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m3Var.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (field = x2Var.getField(m3Var.descriptor)) != null) {
                    valueOf = f4.mergeMessage(field, valueOf);
                }
                x2Var.setField(m3Var.descriptor, valueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.b2
    public void parseLengthPrefixedMessageSetItem(t6 t6Var, Object obj, a2 a2Var, x2 x2Var) throws IOException {
        m3 m3Var = (m3) obj;
        x2Var.setField(m3Var.descriptor, ((t0) t6Var).readMessage(m3Var.getMessageDefaultInstance().getClass(), a2Var));
    }

    @Override // com.google.protobuf.b2
    public void parseMessageSetItem(h0 h0Var, Object obj, a2 a2Var, x2 x2Var) throws IOException {
        m3 m3Var = (m3) obj;
        n5 newBuilderForType = m3Var.getMessageDefaultInstance().newBuilderForType();
        r0 newCodedInput = h0Var.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, a2Var);
        x2Var.setField(m3Var.descriptor, ((h3) newBuilderForType).buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.b2
    public void serializeExtension(ba baVar, Map.Entry<?, ?> entry) throws IOException {
        l3 l3Var = (l3) entry.getKey();
        if (l3Var.isRepeated()) {
            switch (c2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[l3Var.getLiteType().ordinal()]) {
                case 1:
                    b7.writeDoubleList(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 2:
                    b7.writeFloatList(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 3:
                    b7.writeInt64List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 4:
                    b7.writeUInt64List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 5:
                    b7.writeInt32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 6:
                    b7.writeFixed64List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 7:
                    b7.writeFixed32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 8:
                    b7.writeBoolList(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 9:
                    b7.writeUInt32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 10:
                    b7.writeSFixed32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 11:
                    b7.writeSFixed64List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 12:
                    b7.writeSInt32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 13:
                    b7.writeSInt64List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 14:
                    b7.writeInt32List(l3Var.getNumber(), (List) entry.getValue(), baVar, l3Var.isPacked());
                    return;
                case 15:
                    b7.writeBytesList(l3Var.getNumber(), (List) entry.getValue(), baVar);
                    return;
                case 16:
                    b7.writeStringList(l3Var.getNumber(), (List) entry.getValue(), baVar);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        b7.writeGroupList(l3Var.getNumber(), (List) entry.getValue(), baVar, p6.getInstance().schemaFor((Class) list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        b7.writeMessageList(l3Var.getNumber(), (List) entry.getValue(), baVar, p6.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (c2.$SwitchMap$com$google$protobuf$WireFormat$FieldType[l3Var.getLiteType().ordinal()]) {
            case 1:
                ((f1) baVar).writeDouble(l3Var.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((f1) baVar).writeFloat(l3Var.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((f1) baVar).writeInt64(l3Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((f1) baVar).writeUInt64(l3Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((f1) baVar).writeInt32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((f1) baVar).writeFixed64(l3Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((f1) baVar).writeFixed32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((f1) baVar).writeBool(l3Var.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((f1) baVar).writeUInt32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((f1) baVar).writeSFixed32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((f1) baVar).writeSFixed64(l3Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((f1) baVar).writeSInt32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((f1) baVar).writeSInt64(l3Var.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((f1) baVar).writeInt32(l3Var.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((f1) baVar).writeBytes(l3Var.getNumber(), (h0) entry.getValue());
                return;
            case 16:
                ((f1) baVar).writeString(l3Var.getNumber(), (String) entry.getValue());
                return;
            case 17:
                ((f1) baVar).writeGroup(l3Var.getNumber(), entry.getValue(), p6.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            case 18:
                ((f1) baVar).writeMessage(l3Var.getNumber(), entry.getValue(), p6.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // com.google.protobuf.b2
    public void setExtensions(Object obj, x2 x2Var) {
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions = x2Var;
    }
}
