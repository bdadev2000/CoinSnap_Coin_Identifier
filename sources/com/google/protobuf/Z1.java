package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z1 extends X1 {
    @Override // com.google.protobuf.X1
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((I2) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.X1
    public Object findExtensionByNumber(W1 w1, N3 n32, int i9) {
        return w1.findLiteExtensionByNumber(n32, i9);
    }

    @Override // com.google.protobuf.X1
    public C2001t2 getExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.X1
    public C2001t2 getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.X1
    public boolean hasExtensions(N3 n32) {
        return n32 instanceof GeneratedMessageLite$ExtendableMessage;
    }

    @Override // com.google.protobuf.X1
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.X1
    public <UT, UB> UB parseExtension(Object obj, InterfaceC1996s4 interfaceC1996s4, Object obj2, W1 w1, C2001t2 c2001t2, UB ub, AbstractC1990r5 abstractC1990r5) throws IOException {
        Object valueOf;
        Object field;
        ArrayList arrayList;
        J2 j22 = (J2) obj2;
        int number = j22.getNumber();
        if (j22.descriptor.isRepeated() && j22.descriptor.isPacked()) {
            switch (Y1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[j22.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ((U) interfaceC1996s4).readEnumList(arrayList);
                    ub = (UB) A4.filterUnknownEnumList(obj, number, arrayList, j22.descriptor.getEnumType(), ub, abstractC1990r5);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + j22.descriptor.getLiteType());
            }
            c2001t2.setField(j22.descriptor, arrayList);
        } else {
            if (j22.getLiteType() == S5.ENUM) {
                int readInt32 = ((U) interfaceC1996s4).readInt32();
                if (j22.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                    return (UB) A4.storeUnknownEnum(obj, number, readInt32, ub, abstractC1990r5);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (Y1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[j22.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(((U) interfaceC1996s4).readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(((U) interfaceC1996s4).readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(((U) interfaceC1996s4).readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(((U) interfaceC1996s4).readUInt64());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(((U) interfaceC1996s4).readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(((U) interfaceC1996s4).readFixed64());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(((U) interfaceC1996s4).readFixed32());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(((U) interfaceC1996s4).readBool());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(((U) interfaceC1996s4).readUInt32());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(((U) interfaceC1996s4).readSFixed32());
                        break;
                    case 11:
                        valueOf = Long.valueOf(((U) interfaceC1996s4).readSFixed64());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(((U) interfaceC1996s4).readSInt32());
                        break;
                    case 13:
                        valueOf = Long.valueOf(((U) interfaceC1996s4).readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = ((U) interfaceC1996s4).readBytes();
                        break;
                    case 16:
                        valueOf = ((U) interfaceC1996s4).readString();
                        break;
                    case 17:
                        if (!j22.isRepeated()) {
                            Object field2 = c2001t2.getField(j22.descriptor);
                            if (field2 instanceof L2) {
                                InterfaceC2038y4 schemaFor = C1969o4.getInstance().schemaFor((C1969o4) field2);
                                if (!((L2) field2).isMutable()) {
                                    Object newInstance = schemaFor.newInstance();
                                    schemaFor.mergeFrom(newInstance, field2);
                                    c2001t2.setField(j22.descriptor, newInstance);
                                    field2 = newInstance;
                                }
                                ((U) interfaceC1996s4).mergeGroupField(field2, schemaFor, w1);
                                return ub;
                            }
                        }
                        valueOf = ((U) interfaceC1996s4).readGroup(j22.getMessageDefaultInstance().getClass(), w1);
                        break;
                    case 18:
                        if (!j22.isRepeated()) {
                            Object field3 = c2001t2.getField(j22.descriptor);
                            if (field3 instanceof L2) {
                                InterfaceC2038y4 schemaFor2 = C1969o4.getInstance().schemaFor((C1969o4) field3);
                                if (!((L2) field3).isMutable()) {
                                    Object newInstance2 = schemaFor2.newInstance();
                                    schemaFor2.mergeFrom(newInstance2, field3);
                                    c2001t2.setField(j22.descriptor, newInstance2);
                                    field3 = newInstance2;
                                }
                                ((U) interfaceC1996s4).mergeMessageField(field3, schemaFor2, w1);
                                return ub;
                            }
                        }
                        valueOf = ((U) interfaceC1996s4).readMessage(j22.getMessageDefaultInstance().getClass(), w1);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (j22.isRepeated()) {
                c2001t2.addRepeatedField(j22.descriptor, valueOf);
            } else {
                int i9 = Y1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[j22.getLiteType().ordinal()];
                if ((i9 == 17 || i9 == 18) && (field = c2001t2.getField(j22.descriptor)) != null) {
                    valueOf = C1898e3.mergeMessage(field, valueOf);
                }
                c2001t2.setField(j22.descriptor, valueOf);
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.X1
    public void parseLengthPrefixedMessageSetItem(InterfaceC1996s4 interfaceC1996s4, Object obj, W1 w1, C2001t2 c2001t2) throws IOException {
        J2 j22 = (J2) obj;
        c2001t2.setField(j22.descriptor, ((U) interfaceC1996s4).readMessage(j22.getMessageDefaultInstance().getClass(), w1));
    }

    @Override // com.google.protobuf.X1
    public void parseMessageSetItem(H h6, Object obj, W1 w1, C2001t2 c2001t2) throws IOException {
        J2 j22 = (J2) obj;
        M3 newBuilderForType = j22.getMessageDefaultInstance().newBuilderForType();
        S newCodedInput = h6.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, w1);
        c2001t2.setField(j22.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.X1
    public void serializeExtension(a6 a6Var, Map.Entry<?, ?> entry) throws IOException {
        I2 i22 = (I2) entry.getKey();
        if (i22.isRepeated()) {
            switch (Y1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[i22.getLiteType().ordinal()]) {
                case 1:
                    A4.writeDoubleList(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 2:
                    A4.writeFloatList(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 3:
                    A4.writeInt64List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 4:
                    A4.writeUInt64List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 5:
                    A4.writeInt32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 6:
                    A4.writeFixed64List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 7:
                    A4.writeFixed32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 8:
                    A4.writeBoolList(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 9:
                    A4.writeUInt32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 10:
                    A4.writeSFixed32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 11:
                    A4.writeSFixed64List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 12:
                    A4.writeSInt32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 13:
                    A4.writeSInt64List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 14:
                    A4.writeInt32List(i22.getNumber(), (List) entry.getValue(), a6Var, i22.isPacked());
                    return;
                case 15:
                    A4.writeBytesList(i22.getNumber(), (List) entry.getValue(), a6Var);
                    return;
                case 16:
                    A4.writeStringList(i22.getNumber(), (List) entry.getValue(), a6Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        A4.writeGroupList(i22.getNumber(), (List) entry.getValue(), a6Var, C1969o4.getInstance().schemaFor((Class) list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        A4.writeMessageList(i22.getNumber(), (List) entry.getValue(), a6Var, C1969o4.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (Y1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[i22.getLiteType().ordinal()]) {
            case 1:
                ((C1909g0) a6Var).writeDouble(i22.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((C1909g0) a6Var).writeFloat(i22.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((C1909g0) a6Var).writeInt64(i22.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((C1909g0) a6Var).writeUInt64(i22.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((C1909g0) a6Var).writeInt32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((C1909g0) a6Var).writeFixed64(i22.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((C1909g0) a6Var).writeFixed32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((C1909g0) a6Var).writeBool(i22.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((C1909g0) a6Var).writeUInt32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((C1909g0) a6Var).writeSFixed32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((C1909g0) a6Var).writeSFixed64(i22.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((C1909g0) a6Var).writeSInt32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((C1909g0) a6Var).writeSInt64(i22.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((C1909g0) a6Var).writeInt32(i22.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((C1909g0) a6Var).writeBytes(i22.getNumber(), (H) entry.getValue());
                return;
            case 16:
                ((C1909g0) a6Var).writeString(i22.getNumber(), (String) entry.getValue());
                return;
            case 17:
                ((C1909g0) a6Var).writeGroup(i22.getNumber(), entry.getValue(), C1969o4.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            case 18:
                ((C1909g0) a6Var).writeMessage(i22.getNumber(), entry.getValue(), C1969o4.getInstance().schemaFor((Class) entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // com.google.protobuf.X1
    public void setExtensions(Object obj, C2001t2 c2001t2) {
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions = c2001t2;
    }
}
