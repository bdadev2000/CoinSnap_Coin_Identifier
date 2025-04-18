package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class o {
    private o() {
    }

    public static int decodeBoolList(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        boolean z10;
        boolean z11;
        s sVar = (s) e4Var;
        int decodeVarint64 = decodeVarint64(bArr, i11, nVar);
        if (nVar.long1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.addBoolean(z10);
        while (decodeVarint64 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, nVar);
            if (nVar.long1 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sVar.addBoolean(z11);
        }
        return decodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i10, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1;
        if (i11 >= 0) {
            if (i11 <= bArr.length - decodeVarint32) {
                if (i11 == 0) {
                    nVar.object1 = h0.EMPTY;
                    return decodeVarint32;
                }
                nVar.object1 = h0.copyFrom(bArr, decodeVarint32, i11);
                return decodeVarint32 + i11;
            }
            throw h4.truncatedMessage();
        }
        throw h4.negativeSize();
    }

    public static int decodeBytesList(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
        int i13 = nVar.int1;
        if (i13 >= 0) {
            if (i13 <= bArr.length - decodeVarint32) {
                if (i13 == 0) {
                    e4Var.add(h0.EMPTY);
                } else {
                    e4Var.add(h0.copyFrom(bArr, decodeVarint32, i13));
                    decodeVarint32 += i13;
                }
                while (decodeVarint32 < i12) {
                    int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, nVar);
                    if (i10 != nVar.int1) {
                        break;
                    }
                    decodeVarint32 = decodeVarint32(bArr, decodeVarint322, nVar);
                    int i14 = nVar.int1;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - decodeVarint32) {
                            if (i14 == 0) {
                                e4Var.add(h0.EMPTY);
                            } else {
                                e4Var.add(h0.copyFrom(bArr, decodeVarint32, i14));
                                decodeVarint32 += i14;
                            }
                        } else {
                            throw h4.truncatedMessage();
                        }
                    } else {
                        throw h4.negativeSize();
                    }
                }
                return decodeVarint32;
            }
            throw h4.truncatedMessage();
        }
        throw h4.negativeSize();
    }

    public static double decodeDouble(byte[] bArr, int i10) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i10));
    }

    public static int decodeDoubleList(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        g1 g1Var = (g1) e4Var;
        g1Var.addDouble(decodeDouble(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, i13, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            g1Var.addDouble(decodeDouble(bArr, decodeVarint32));
            i13 = decodeVarint32 + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x011f. Please report as an issue. */
    public static int decodeExtension(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite$ExtendableMessage<?, ?> generatedMessageLite$ExtendableMessage, m3 m3Var, s8 s8Var, n nVar) throws IOException {
        boolean z10;
        x2 x2Var = generatedMessageLite$ExtendableMessage.extensions;
        int i13 = i10 >>> 3;
        if (m3Var.descriptor.isRepeated() && m3Var.descriptor.isPacked()) {
            switch (m.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m3Var.getLiteType().ordinal()]) {
                case 1:
                    g1 g1Var = new g1();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i11, g1Var, nVar);
                    x2Var.setField(m3Var.descriptor, g1Var);
                    return decodePackedDoubleList;
                case 2:
                    b3 b3Var = new b3();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i11, b3Var, nVar);
                    x2Var.setField(m3Var.descriptor, b3Var);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    a5 a5Var = new a5();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i11, a5Var, nVar);
                    x2Var.setField(m3Var.descriptor, a5Var);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    v3 v3Var = new v3();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i11, v3Var, nVar);
                    x2Var.setField(m3Var.descriptor, v3Var);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    a5 a5Var2 = new a5();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i11, a5Var2, nVar);
                    x2Var.setField(m3Var.descriptor, a5Var2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    v3 v3Var2 = new v3();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i11, v3Var2, nVar);
                    x2Var.setField(m3Var.descriptor, v3Var2);
                    return decodePackedFixed32List;
                case 11:
                    s sVar = new s();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i11, sVar, nVar);
                    x2Var.setField(m3Var.descriptor, sVar);
                    return decodePackedBoolList;
                case 12:
                    v3 v3Var3 = new v3();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i11, v3Var3, nVar);
                    x2Var.setField(m3Var.descriptor, v3Var3);
                    return decodePackedSInt32List;
                case 13:
                    a5 a5Var3 = new a5();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i11, a5Var3, nVar);
                    x2Var.setField(m3Var.descriptor, a5Var3);
                    return decodePackedSInt64List;
                case 14:
                    v3 v3Var4 = new v3();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i11, v3Var4, nVar);
                    b7.filterUnknownEnumList(generatedMessageLite$ExtendableMessage, i13, v3Var4, m3Var.descriptor.getEnumType(), (Object) null, s8Var);
                    x2Var.setField(m3Var.descriptor, v3Var4);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + m3Var.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (m3Var.getLiteType() == t9.ENUM) {
            i11 = decodeVarint32(bArr, i11, nVar);
            if (m3Var.descriptor.getEnumType().findValueByNumber(nVar.int1) == null) {
                b7.storeUnknownEnum(generatedMessageLite$ExtendableMessage, i13, nVar.int1, null, s8Var);
                return i11;
            }
            obj = Integer.valueOf(nVar.int1);
        } else {
            switch (m.$SwitchMap$com$google$protobuf$WireFormat$FieldType[m3Var.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(decodeDouble(bArr, i11));
                    i11 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(decodeFloat(bArr, i11));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = decodeVarint64(bArr, i11, nVar);
                    obj = Long.valueOf(nVar.long1);
                    break;
                case 5:
                case 6:
                    i11 = decodeVarint32(bArr, i11, nVar);
                    obj = Integer.valueOf(nVar.int1);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(decodeFixed64(bArr, i11));
                    i11 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(decodeFixed32(bArr, i11));
                    i11 += 4;
                    break;
                case 11:
                    i11 = decodeVarint64(bArr, i11, nVar);
                    if (nVar.long1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    obj = Boolean.valueOf(z10);
                    break;
                case 12:
                    i11 = decodeVarint32(bArr, i11, nVar);
                    obj = Integer.valueOf(r0.decodeZigZag32(nVar.int1));
                    break;
                case 13:
                    i11 = decodeVarint64(bArr, i11, nVar);
                    obj = Long.valueOf(r0.decodeZigZag64(nVar.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = decodeBytes(bArr, i11, nVar);
                    obj = nVar.object1;
                    break;
                case 16:
                    i11 = decodeString(bArr, i11, nVar);
                    obj = nVar.object1;
                    break;
                case 17:
                    int i14 = (i13 << 3) | 4;
                    z6 schemaFor = p6.getInstance().schemaFor((Class) m3Var.getMessageDefaultInstance().getClass());
                    if (m3Var.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, bArr, i11, i12, i14, nVar);
                        x2Var.addRepeatedField(m3Var.descriptor, nVar.object1);
                        return decodeGroupField;
                    }
                    Object field = x2Var.getField(m3Var.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        x2Var.setField(m3Var.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, bArr, i11, i12, i14, nVar);
                case 18:
                    z6 schemaFor2 = p6.getInstance().schemaFor((Class) m3Var.getMessageDefaultInstance().getClass());
                    if (m3Var.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, bArr, i11, i12, nVar);
                        x2Var.addRepeatedField(m3Var.descriptor, nVar.object1);
                        return decodeMessageField;
                    }
                    Object field2 = x2Var.getField(m3Var.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        x2Var.setField(m3Var.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, bArr, i11, i12, nVar);
            }
        }
        if (m3Var.isRepeated()) {
            x2Var.addRepeatedField(m3Var.descriptor, obj);
        } else {
            x2Var.setField(m3Var.descriptor, obj);
        }
        return i11;
    }

    public static int decodeExtensionOrUnknownField(int i10, byte[] bArr, int i11, int i12, Object obj, o5 o5Var, s8 s8Var, n nVar) throws IOException {
        m3 findLiteExtensionByNumber = nVar.extensionRegistry.findLiteExtensionByNumber(o5Var, i10 >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i10, bArr, i11, i12, s5.getMutableUnknownFields(obj), nVar);
        }
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i10, bArr, i11, i12, generatedMessageLite$ExtendableMessage, findLiteExtensionByNumber, s8Var, nVar);
    }

    public static int decodeFixed32(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int decodeFixed32List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        v3 v3Var = (v3) e4Var;
        v3Var.addInt(decodeFixed32(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, i13, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            v3Var.addInt(decodeFixed32(bArr, decodeVarint32));
            i13 = decodeVarint32 + 4;
        }
        return i13;
    }

    public static long decodeFixed64(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        a5 a5Var = (a5) e4Var;
        a5Var.addLong(decodeFixed64(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, i13, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            a5Var.addLong(decodeFixed64(bArr, decodeVarint32));
            i13 = decodeVarint32 + 8;
        }
        return i13;
    }

    public static float decodeFloat(byte[] bArr, int i10) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i10));
    }

    public static int decodeFloatList(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        b3 b3Var = (b3) e4Var;
        b3Var.addFloat(decodeFloat(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, i13, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            b3Var.addFloat(decodeFloat(bArr, decodeVarint32));
            i13 = decodeVarint32 + 4;
        }
        return i13;
    }

    public static int decodeGroupField(z6 z6Var, byte[] bArr, int i10, int i11, int i12, n nVar) throws IOException {
        Object newInstance = z6Var.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, z6Var, bArr, i10, i11, i12, nVar);
        z6Var.makeImmutable(newInstance);
        nVar.object1 = newInstance;
        return mergeGroupField;
    }

    public static int decodeGroupList(z6 z6Var, int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int decodeGroupField = decodeGroupField(z6Var, bArr, i11, i12, i13, nVar);
        e4Var.add(nVar.object1);
        while (decodeGroupField < i12) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(z6Var, bArr, decodeVarint32, i12, i13, nVar);
            e4Var.add(nVar.object1);
        }
        return decodeGroupField;
    }

    public static int decodeMessageField(z6 z6Var, byte[] bArr, int i10, int i11, n nVar) throws IOException {
        Object newInstance = z6Var.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, z6Var, bArr, i10, i11, nVar);
        z6Var.makeImmutable(newInstance);
        nVar.object1 = newInstance;
        return mergeMessageField;
    }

    public static int decodeMessageList(z6 z6Var, int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) throws IOException {
        int decodeMessageField = decodeMessageField(z6Var, bArr, i11, i12, nVar);
        e4Var.add(nVar.object1);
        while (decodeMessageField < i12) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(z6Var, bArr, decodeVarint32, i12, nVar);
            e4Var.add(nVar.object1);
        }
        return decodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        boolean z10;
        s sVar = (s) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, nVar);
            if (nVar.long1 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sVar.addBoolean(z10);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        g1 g1Var = (g1) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            g1Var.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        v3 v3Var = (v3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            v3Var.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        a5 a5Var = (a5) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            a5Var.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        b3 b3Var = (b3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            b3Var.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        v3 v3Var = (v3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, nVar);
            v3Var.addInt(r0.decodeZigZag32(nVar.int1));
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        a5 a5Var = (a5) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, nVar);
            a5Var.addLong(r0.decodeZigZag64(nVar.long1));
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        v3 v3Var = (v3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, nVar);
            v3Var.addInt(nVar.int1);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i10, e4 e4Var, n nVar) throws IOException {
        a5 a5Var = (a5) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, nVar);
            a5Var.addLong(nVar.long1);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw h4.truncatedMessage();
    }

    public static int decodeSInt32List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        v3 v3Var = (v3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
        v3Var.addInt(r0.decodeZigZag32(nVar.int1));
        while (decodeVarint32 < i12) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, nVar);
            v3Var.addInt(r0.decodeZigZag32(nVar.int1));
        }
        return decodeVarint32;
    }

    public static int decodeSInt64List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        a5 a5Var = (a5) e4Var;
        int decodeVarint64 = decodeVarint64(bArr, i11, nVar);
        a5Var.addLong(r0.decodeZigZag64(nVar.long1));
        while (decodeVarint64 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, nVar);
            a5Var.addLong(r0.decodeZigZag64(nVar.long1));
        }
        return decodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i10, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1;
        if (i11 >= 0) {
            if (i11 == 0) {
                nVar.object1 = "";
                return decodeVarint32;
            }
            nVar.object1 = new String(bArr, decodeVarint32, i11, f4.UTF_8);
            return decodeVarint32 + i11;
        }
        throw h4.negativeSize();
    }

    public static int decodeStringList(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
        int i13 = nVar.int1;
        if (i13 >= 0) {
            if (i13 == 0) {
                e4Var.add("");
            } else {
                e4Var.add(new String(bArr, decodeVarint32, i13, f4.UTF_8));
                decodeVarint32 += i13;
            }
            while (decodeVarint32 < i12) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, nVar);
                if (i10 != nVar.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, nVar);
                int i14 = nVar.int1;
                if (i14 >= 0) {
                    if (i14 == 0) {
                        e4Var.add("");
                    } else {
                        e4Var.add(new String(bArr, decodeVarint32, i14, f4.UTF_8));
                        decodeVarint32 += i14;
                    }
                } else {
                    throw h4.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw h4.negativeSize();
    }

    public static int decodeStringListRequireUtf8(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
        int i13 = nVar.int1;
        if (i13 >= 0) {
            if (i13 == 0) {
                e4Var.add("");
            } else {
                int i14 = decodeVarint32 + i13;
                if (j9.isValidUtf8(bArr, decodeVarint32, i14)) {
                    e4Var.add(new String(bArr, decodeVarint32, i13, f4.UTF_8));
                    decodeVarint32 = i14;
                } else {
                    throw h4.invalidUtf8();
                }
            }
            while (decodeVarint32 < i12) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, nVar);
                if (i10 != nVar.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, nVar);
                int i15 = nVar.int1;
                if (i15 >= 0) {
                    if (i15 == 0) {
                        e4Var.add("");
                    } else {
                        int i16 = decodeVarint32 + i15;
                        if (j9.isValidUtf8(bArr, decodeVarint32, i16)) {
                            e4Var.add(new String(bArr, decodeVarint32, i15, f4.UTF_8));
                            decodeVarint32 = i16;
                        } else {
                            throw h4.invalidUtf8();
                        }
                    }
                } else {
                    throw h4.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw h4.negativeSize();
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i10, n nVar) throws h4 {
        int decodeVarint32 = decodeVarint32(bArr, i10, nVar);
        int i11 = nVar.int1;
        if (i11 >= 0) {
            if (i11 == 0) {
                nVar.object1 = "";
                return decodeVarint32;
            }
            nVar.object1 = j9.decodeUtf8(bArr, decodeVarint32, i11);
            return decodeVarint32 + i11;
        }
        throw h4.negativeSize();
    }

    public static int decodeUnknownField(int i10, byte[] bArr, int i11, int i12, t8 t8Var, n nVar) throws h4 {
        if (z9.getTagFieldNumber(i10) != 0) {
            int tagWireType = z9.getTagWireType(i10);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                t8Var.storeField(i10, Integer.valueOf(decodeFixed32(bArr, i11)));
                                return i11 + 4;
                            }
                            throw h4.invalidTag();
                        }
                        t8 newInstance = t8.newInstance();
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
                            int i15 = nVar.int1;
                            if (i15 == i13) {
                                i14 = i15;
                                i11 = decodeVarint32;
                                break;
                            }
                            i14 = i15;
                            i11 = decodeUnknownField(i15, bArr, decodeVarint32, i12, newInstance, nVar);
                        }
                        if (i11 <= i12 && i14 == i13) {
                            t8Var.storeField(i10, newInstance);
                            return i11;
                        }
                        throw h4.parseFailure();
                    }
                    int decodeVarint322 = decodeVarint32(bArr, i11, nVar);
                    int i16 = nVar.int1;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - decodeVarint322) {
                            if (i16 == 0) {
                                t8Var.storeField(i10, h0.EMPTY);
                            } else {
                                t8Var.storeField(i10, h0.copyFrom(bArr, decodeVarint322, i16));
                            }
                            return decodeVarint322 + i16;
                        }
                        throw h4.truncatedMessage();
                    }
                    throw h4.negativeSize();
                }
                t8Var.storeField(i10, Long.valueOf(decodeFixed64(bArr, i11)));
                return i11 + 8;
            }
            int decodeVarint64 = decodeVarint64(bArr, i11, nVar);
            t8Var.storeField(i10, Long.valueOf(nVar.long1));
            return decodeVarint64;
        }
        throw h4.invalidTag();
    }

    public static int decodeVarint32(byte[] bArr, int i10, n nVar) {
        int i11 = i10 + 1;
        byte b3 = bArr[i10];
        if (b3 >= 0) {
            nVar.int1 = b3;
            return i11;
        }
        return decodeVarint32(b3, bArr, i11, nVar);
    }

    public static int decodeVarint32List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        v3 v3Var = (v3) e4Var;
        int decodeVarint32 = decodeVarint32(bArr, i11, nVar);
        v3Var.addInt(nVar.int1);
        while (decodeVarint32 < i12) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, nVar);
            v3Var.addInt(nVar.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i10, n nVar) {
        int i11 = i10 + 1;
        long j3 = bArr[i10];
        if (j3 >= 0) {
            nVar.long1 = j3;
            return i11;
        }
        return decodeVarint64(j3, bArr, i11, nVar);
    }

    public static int decodeVarint64List(int i10, byte[] bArr, int i11, int i12, e4 e4Var, n nVar) {
        a5 a5Var = (a5) e4Var;
        int decodeVarint64 = decodeVarint64(bArr, i11, nVar);
        a5Var.addLong(nVar.long1);
        while (decodeVarint64 < i12) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, nVar);
            if (i10 != nVar.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, nVar);
            a5Var.addLong(nVar.long1);
        }
        return decodeVarint64;
    }

    public static int mergeGroupField(Object obj, z6 z6Var, byte[] bArr, int i10, int i11, int i12, n nVar) throws IOException {
        int parseProto2Message = ((s5) z6Var).parseProto2Message(obj, bArr, i10, i11, i12, nVar);
        nVar.object1 = obj;
        return parseProto2Message;
    }

    public static int mergeMessageField(Object obj, z6 z6Var, byte[] bArr, int i10, int i11, n nVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = decodeVarint32(i13, bArr, i12, nVar);
            i13 = nVar.int1;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            z6Var.mergeFrom(obj, bArr, i14, i15, nVar);
            nVar.object1 = obj;
            return i15;
        }
        throw h4.truncatedMessage();
    }

    public static int skipField(int i10, byte[] bArr, int i11, int i12, n nVar) throws h4 {
        if (z9.getTagFieldNumber(i10) != 0) {
            int tagWireType = z9.getTagWireType(i10);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i11 + 4;
                            }
                            throw h4.invalidTag();
                        }
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = 0;
                        while (i11 < i12) {
                            i11 = decodeVarint32(bArr, i11, nVar);
                            i14 = nVar.int1;
                            if (i14 == i13) {
                                break;
                            }
                            i11 = skipField(i14, bArr, i11, i12, nVar);
                        }
                        if (i11 <= i12 && i14 == i13) {
                            return i11;
                        }
                        throw h4.parseFailure();
                    }
                    return decodeVarint32(bArr, i11, nVar) + nVar.int1;
                }
                return i11 + 8;
            }
            return decodeVarint64(bArr, i11, nVar);
        }
        throw h4.invalidTag();
    }

    public static int decodeVarint32(int i10, byte[] bArr, int i11, n nVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 >= 0) {
            nVar.int1 = i12 | (b3 << 7);
            return i13;
        }
        int i14 = i12 | ((b3 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            nVar.int1 = i14 | (b10 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            nVar.int1 = i16 | (b11 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            nVar.int1 = i18 | (b12 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                nVar.int1 = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int decodeVarint64(long j3, byte[] bArr, int i10, n nVar) {
        int i11 = i10 + 1;
        byte b3 = bArr[i10];
        long j10 = (j3 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b3 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b3 = b10;
        }
        nVar.long1 = j10;
        return i11;
    }
}
