package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1964o {
    private C1964o() {
    }

    public static int decodeBoolList(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        boolean z8;
        boolean z9;
        C1991s c1991s = (C1991s) interfaceC1891d3;
        int decodeVarint64 = decodeVarint64(bArr, i10, c1957n);
        if (c1957n.long1 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        c1991s.addBoolean(z8);
        while (decodeVarint64 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, c1957n);
            if (c1957n.long1 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            c1991s.addBoolean(z9);
        }
        return decodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i9, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1;
        if (i10 >= 0) {
            if (i10 <= bArr.length - decodeVarint32) {
                if (i10 == 0) {
                    c1957n.object1 = H.EMPTY;
                    return decodeVarint32;
                }
                c1957n.object1 = H.copyFrom(bArr, decodeVarint32, i10);
                return decodeVarint32 + i10;
            }
            throw C1912g3.truncatedMessage();
        }
        throw C1912g3.negativeSize();
    }

    public static int decodeBytesList(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
        int i12 = c1957n.int1;
        if (i12 >= 0) {
            if (i12 <= bArr.length - decodeVarint32) {
                if (i12 == 0) {
                    interfaceC1891d3.add(H.EMPTY);
                } else {
                    interfaceC1891d3.add(H.copyFrom(bArr, decodeVarint32, i12));
                    decodeVarint32 += i12;
                }
                while (decodeVarint32 < i11) {
                    int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, c1957n);
                    if (i9 != c1957n.int1) {
                        break;
                    }
                    decodeVarint32 = decodeVarint32(bArr, decodeVarint322, c1957n);
                    int i13 = c1957n.int1;
                    if (i13 >= 0) {
                        if (i13 <= bArr.length - decodeVarint32) {
                            if (i13 == 0) {
                                interfaceC1891d3.add(H.EMPTY);
                            } else {
                                interfaceC1891d3.add(H.copyFrom(bArr, decodeVarint32, i13));
                                decodeVarint32 += i13;
                            }
                        } else {
                            throw C1912g3.truncatedMessage();
                        }
                    } else {
                        throw C1912g3.negativeSize();
                    }
                }
                return decodeVarint32;
            }
            throw C1912g3.truncatedMessage();
        }
        throw C1912g3.negativeSize();
    }

    public static double decodeDouble(byte[] bArr, int i9) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i9));
    }

    public static int decodeDoubleList(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        C1 c12 = (C1) interfaceC1891d3;
        c12.addDouble(decodeDouble(bArr, i10));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, i12, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            c12.addDouble(decodeDouble(bArr, decodeVarint32));
            i12 = decodeVarint32 + 8;
        }
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x011f. Please report as an issue. */
    public static int decodeExtension(int i9, byte[] bArr, int i10, int i11, GeneratedMessageLite$ExtendableMessage<?, ?> generatedMessageLite$ExtendableMessage, J2 j22, AbstractC1990r5 abstractC1990r5, C1957n c1957n) throws IOException {
        boolean z8;
        C2001t2 c2001t2 = generatedMessageLite$ExtendableMessage.extensions;
        int i12 = i9 >>> 3;
        if (j22.descriptor.isRepeated() && j22.descriptor.isPacked()) {
            switch (AbstractC1950m.$SwitchMap$com$google$protobuf$WireFormat$FieldType[j22.getLiteType().ordinal()]) {
                case 1:
                    C1 c12 = new C1();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i10, c12, c1957n);
                    c2001t2.setField(j22.descriptor, c12);
                    return decodePackedDoubleList;
                case 2:
                    C2029x2 c2029x2 = new C2029x2();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i10, c2029x2, c1957n);
                    c2001t2.setField(j22.descriptor, c2029x2);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    C2044z3 c2044z3 = new C2044z3();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i10, c2044z3, c1957n);
                    c2001t2.setField(j22.descriptor, c2044z3);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    S2 s22 = new S2();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i10, s22, c1957n);
                    c2001t2.setField(j22.descriptor, s22);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    C2044z3 c2044z32 = new C2044z3();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i10, c2044z32, c1957n);
                    c2001t2.setField(j22.descriptor, c2044z32);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    S2 s23 = new S2();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i10, s23, c1957n);
                    c2001t2.setField(j22.descriptor, s23);
                    return decodePackedFixed32List;
                case 11:
                    C1991s c1991s = new C1991s();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i10, c1991s, c1957n);
                    c2001t2.setField(j22.descriptor, c1991s);
                    return decodePackedBoolList;
                case 12:
                    S2 s24 = new S2();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i10, s24, c1957n);
                    c2001t2.setField(j22.descriptor, s24);
                    return decodePackedSInt32List;
                case 13:
                    C2044z3 c2044z33 = new C2044z3();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i10, c2044z33, c1957n);
                    c2001t2.setField(j22.descriptor, c2044z33);
                    return decodePackedSInt64List;
                case 14:
                    S2 s25 = new S2();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i10, s25, c1957n);
                    A4.filterUnknownEnumList(generatedMessageLite$ExtendableMessage, i12, s25, j22.descriptor.getEnumType(), (Object) null, abstractC1990r5);
                    c2001t2.setField(j22.descriptor, s25);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + j22.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (j22.getLiteType() == S5.ENUM) {
            i10 = decodeVarint32(bArr, i10, c1957n);
            if (j22.descriptor.getEnumType().findValueByNumber(c1957n.int1) == null) {
                A4.storeUnknownEnum(generatedMessageLite$ExtendableMessage, i12, c1957n.int1, null, abstractC1990r5);
                return i10;
            }
            obj = Integer.valueOf(c1957n.int1);
        } else {
            switch (AbstractC1950m.$SwitchMap$com$google$protobuf$WireFormat$FieldType[j22.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(decodeDouble(bArr, i10));
                    i10 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(decodeFloat(bArr, i10));
                    i10 += 4;
                    break;
                case 3:
                case 4:
                    i10 = decodeVarint64(bArr, i10, c1957n);
                    obj = Long.valueOf(c1957n.long1);
                    break;
                case 5:
                case 6:
                    i10 = decodeVarint32(bArr, i10, c1957n);
                    obj = Integer.valueOf(c1957n.int1);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(decodeFixed64(bArr, i10));
                    i10 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(decodeFixed32(bArr, i10));
                    i10 += 4;
                    break;
                case 11:
                    i10 = decodeVarint64(bArr, i10, c1957n);
                    if (c1957n.long1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = Boolean.valueOf(z8);
                    break;
                case 12:
                    i10 = decodeVarint32(bArr, i10, c1957n);
                    obj = Integer.valueOf(S.decodeZigZag32(c1957n.int1));
                    break;
                case 13:
                    i10 = decodeVarint64(bArr, i10, c1957n);
                    obj = Long.valueOf(S.decodeZigZag64(c1957n.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i10 = decodeBytes(bArr, i10, c1957n);
                    obj = c1957n.object1;
                    break;
                case 16:
                    i10 = decodeString(bArr, i10, c1957n);
                    obj = c1957n.object1;
                    break;
                case 17:
                    int i13 = (i12 << 3) | 4;
                    InterfaceC2038y4 schemaFor = C1969o4.getInstance().schemaFor((Class) j22.getMessageDefaultInstance().getClass());
                    if (j22.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, bArr, i10, i11, i13, c1957n);
                        c2001t2.addRepeatedField(j22.descriptor, c1957n.object1);
                        return decodeGroupField;
                    }
                    Object field = c2001t2.getField(j22.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        c2001t2.setField(j22.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, bArr, i10, i11, i13, c1957n);
                case 18:
                    InterfaceC2038y4 schemaFor2 = C1969o4.getInstance().schemaFor((Class) j22.getMessageDefaultInstance().getClass());
                    if (j22.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, bArr, i10, i11, c1957n);
                        c2001t2.addRepeatedField(j22.descriptor, c1957n.object1);
                        return decodeMessageField;
                    }
                    Object field2 = c2001t2.getField(j22.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        c2001t2.setField(j22.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, bArr, i10, i11, c1957n);
            }
        }
        if (j22.isRepeated()) {
            c2001t2.addRepeatedField(j22.descriptor, obj);
        } else {
            c2001t2.setField(j22.descriptor, obj);
        }
        return i10;
    }

    public static int decodeExtensionOrUnknownField(int i9, byte[] bArr, int i10, int i11, Object obj, N3 n32, AbstractC1990r5 abstractC1990r5, C1957n c1957n) throws IOException {
        J2 findLiteExtensionByNumber = c1957n.extensionRegistry.findLiteExtensionByNumber(n32, i9 >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i9, bArr, i10, i11, R3.getMutableUnknownFields(obj), c1957n);
        }
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i9, bArr, i10, i11, generatedMessageLite$ExtendableMessage, findLiteExtensionByNumber, abstractC1990r5, c1957n);
    }

    public static int decodeFixed32(byte[] bArr, int i9) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        S2 s22 = (S2) interfaceC1891d3;
        s22.addInt(decodeFixed32(bArr, i10));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, i12, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            s22.addInt(decodeFixed32(bArr, decodeVarint32));
            i12 = decodeVarint32 + 4;
        }
        return i12;
    }

    public static long decodeFixed64(byte[] bArr, int i9) {
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        c2044z3.addLong(decodeFixed64(bArr, i10));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, i12, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            c2044z3.addLong(decodeFixed64(bArr, decodeVarint32));
            i12 = decodeVarint32 + 8;
        }
        return i12;
    }

    public static float decodeFloat(byte[] bArr, int i9) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i9));
    }

    public static int decodeFloatList(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        C2029x2 c2029x2 = (C2029x2) interfaceC1891d3;
        c2029x2.addFloat(decodeFloat(bArr, i10));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, i12, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            c2029x2.addFloat(decodeFloat(bArr, decodeVarint32));
            i12 = decodeVarint32 + 4;
        }
        return i12;
    }

    public static int decodeGroupField(InterfaceC2038y4 interfaceC2038y4, byte[] bArr, int i9, int i10, int i11, C1957n c1957n) throws IOException {
        Object newInstance = interfaceC2038y4.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, interfaceC2038y4, bArr, i9, i10, i11, c1957n);
        interfaceC2038y4.makeImmutable(newInstance);
        c1957n.object1 = newInstance;
        return mergeGroupField;
    }

    public static int decodeGroupList(InterfaceC2038y4 interfaceC2038y4, int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        int i12 = (i9 & (-8)) | 4;
        int decodeGroupField = decodeGroupField(interfaceC2038y4, bArr, i10, i11, i12, c1957n);
        interfaceC1891d3.add(c1957n.object1);
        while (decodeGroupField < i11) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(interfaceC2038y4, bArr, decodeVarint32, i11, i12, c1957n);
            interfaceC1891d3.add(c1957n.object1);
        }
        return decodeGroupField;
    }

    public static int decodeMessageField(InterfaceC2038y4 interfaceC2038y4, byte[] bArr, int i9, int i10, C1957n c1957n) throws IOException {
        Object newInstance = interfaceC2038y4.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, interfaceC2038y4, bArr, i9, i10, c1957n);
        interfaceC2038y4.makeImmutable(newInstance);
        c1957n.object1 = newInstance;
        return mergeMessageField;
    }

    public static int decodeMessageList(InterfaceC2038y4 interfaceC2038y4, int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        int decodeMessageField = decodeMessageField(interfaceC2038y4, bArr, i10, i11, c1957n);
        interfaceC1891d3.add(c1957n.object1);
        while (decodeMessageField < i11) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(interfaceC2038y4, bArr, decodeVarint32, i11, c1957n);
            interfaceC1891d3.add(c1957n.object1);
        }
        return decodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        boolean z8;
        C1991s c1991s = (C1991s) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, c1957n);
            if (c1957n.long1 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            c1991s.addBoolean(z8);
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        C1 c12 = (C1) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            c12.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        S2 s22 = (S2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            s22.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            c2044z3.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        C2029x2 c2029x2 = (C2029x2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            c2029x2.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        S2 s22 = (S2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, c1957n);
            s22.addInt(S.decodeZigZag32(c1957n.int1));
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, c1957n);
            c2044z3.addLong(S.decodeZigZag64(c1957n.long1));
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        S2 s22 = (S2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, c1957n);
            s22.addInt(c1957n.int1);
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i9, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws IOException {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1 + decodeVarint32;
        while (decodeVarint32 < i10) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, c1957n);
            c2044z3.addLong(c1957n.long1);
        }
        if (decodeVarint32 == i10) {
            return decodeVarint32;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int decodeSInt32List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        S2 s22 = (S2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
        s22.addInt(S.decodeZigZag32(c1957n.int1));
        while (decodeVarint32 < i11) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, c1957n);
            s22.addInt(S.decodeZigZag32(c1957n.int1));
        }
        return decodeVarint32;
    }

    public static int decodeSInt64List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        int decodeVarint64 = decodeVarint64(bArr, i10, c1957n);
        c2044z3.addLong(S.decodeZigZag64(c1957n.long1));
        while (decodeVarint64 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, c1957n);
            c2044z3.addLong(S.decodeZigZag64(c1957n.long1));
        }
        return decodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i9, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1;
        if (i10 >= 0) {
            if (i10 == 0) {
                c1957n.object1 = "";
                return decodeVarint32;
            }
            c1957n.object1 = new String(bArr, decodeVarint32, i10, C1898e3.UTF_8);
            return decodeVarint32 + i10;
        }
        throw C1912g3.negativeSize();
    }

    public static int decodeStringList(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
        int i12 = c1957n.int1;
        if (i12 >= 0) {
            if (i12 == 0) {
                interfaceC1891d3.add("");
            } else {
                interfaceC1891d3.add(new String(bArr, decodeVarint32, i12, C1898e3.UTF_8));
                decodeVarint32 += i12;
            }
            while (decodeVarint32 < i11) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, c1957n);
                if (i9 != c1957n.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, c1957n);
                int i13 = c1957n.int1;
                if (i13 >= 0) {
                    if (i13 == 0) {
                        interfaceC1891d3.add("");
                    } else {
                        interfaceC1891d3.add(new String(bArr, decodeVarint32, i13, C1898e3.UTF_8));
                        decodeVarint32 += i13;
                    }
                } else {
                    throw C1912g3.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw C1912g3.negativeSize();
    }

    public static int decodeStringListRequireUtf8(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
        int i12 = c1957n.int1;
        if (i12 >= 0) {
            if (i12 == 0) {
                interfaceC1891d3.add("");
            } else {
                int i13 = decodeVarint32 + i12;
                if (I5.isValidUtf8(bArr, decodeVarint32, i13)) {
                    interfaceC1891d3.add(new String(bArr, decodeVarint32, i12, C1898e3.UTF_8));
                    decodeVarint32 = i13;
                } else {
                    throw C1912g3.invalidUtf8();
                }
            }
            while (decodeVarint32 < i11) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, c1957n);
                if (i9 != c1957n.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, c1957n);
                int i14 = c1957n.int1;
                if (i14 >= 0) {
                    if (i14 == 0) {
                        interfaceC1891d3.add("");
                    } else {
                        int i15 = decodeVarint32 + i14;
                        if (I5.isValidUtf8(bArr, decodeVarint32, i15)) {
                            interfaceC1891d3.add(new String(bArr, decodeVarint32, i14, C1898e3.UTF_8));
                            decodeVarint32 = i15;
                        } else {
                            throw C1912g3.invalidUtf8();
                        }
                    }
                } else {
                    throw C1912g3.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw C1912g3.negativeSize();
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i9, C1957n c1957n) throws C1912g3 {
        int decodeVarint32 = decodeVarint32(bArr, i9, c1957n);
        int i10 = c1957n.int1;
        if (i10 >= 0) {
            if (i10 == 0) {
                c1957n.object1 = "";
                return decodeVarint32;
            }
            c1957n.object1 = I5.decodeUtf8(bArr, decodeVarint32, i10);
            return decodeVarint32 + i10;
        }
        throw C1912g3.negativeSize();
    }

    public static int decodeUnknownField(int i9, byte[] bArr, int i10, int i11, C1997s5 c1997s5, C1957n c1957n) throws C1912g3 {
        if (Y5.getTagFieldNumber(i9) != 0) {
            int tagWireType = Y5.getTagWireType(i9);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                c1997s5.storeField(i9, Integer.valueOf(decodeFixed32(bArr, i10)));
                                return i10 + 4;
                            }
                            throw C1912g3.invalidTag();
                        }
                        C1997s5 newInstance = C1997s5.newInstance();
                        int i12 = (i9 & (-8)) | 4;
                        int i13 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
                            int i14 = c1957n.int1;
                            if (i14 == i12) {
                                i13 = i14;
                                i10 = decodeVarint32;
                                break;
                            }
                            i13 = i14;
                            i10 = decodeUnknownField(i14, bArr, decodeVarint32, i11, newInstance, c1957n);
                        }
                        if (i10 <= i11 && i13 == i12) {
                            c1997s5.storeField(i9, newInstance);
                            return i10;
                        }
                        throw C1912g3.parseFailure();
                    }
                    int decodeVarint322 = decodeVarint32(bArr, i10, c1957n);
                    int i15 = c1957n.int1;
                    if (i15 >= 0) {
                        if (i15 <= bArr.length - decodeVarint322) {
                            if (i15 == 0) {
                                c1997s5.storeField(i9, H.EMPTY);
                            } else {
                                c1997s5.storeField(i9, H.copyFrom(bArr, decodeVarint322, i15));
                            }
                            return decodeVarint322 + i15;
                        }
                        throw C1912g3.truncatedMessage();
                    }
                    throw C1912g3.negativeSize();
                }
                c1997s5.storeField(i9, Long.valueOf(decodeFixed64(bArr, i10)));
                return i10 + 8;
            }
            int decodeVarint64 = decodeVarint64(bArr, i10, c1957n);
            c1997s5.storeField(i9, Long.valueOf(c1957n.long1));
            return decodeVarint64;
        }
        throw C1912g3.invalidTag();
    }

    public static int decodeVarint32(byte[] bArr, int i9, C1957n c1957n) {
        int i10 = i9 + 1;
        byte b = bArr[i9];
        if (b >= 0) {
            c1957n.int1 = b;
            return i10;
        }
        return decodeVarint32(b, bArr, i10, c1957n);
    }

    public static int decodeVarint32List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        S2 s22 = (S2) interfaceC1891d3;
        int decodeVarint32 = decodeVarint32(bArr, i10, c1957n);
        s22.addInt(c1957n.int1);
        while (decodeVarint32 < i11) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, c1957n);
            s22.addInt(c1957n.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i9, C1957n c1957n) {
        int i10 = i9 + 1;
        long j7 = bArr[i9];
        if (j7 >= 0) {
            c1957n.long1 = j7;
            return i10;
        }
        return decodeVarint64(j7, bArr, i10, c1957n);
    }

    public static int decodeVarint64List(int i9, byte[] bArr, int i10, int i11, InterfaceC1891d3 interfaceC1891d3, C1957n c1957n) {
        C2044z3 c2044z3 = (C2044z3) interfaceC1891d3;
        int decodeVarint64 = decodeVarint64(bArr, i10, c1957n);
        c2044z3.addLong(c1957n.long1);
        while (decodeVarint64 < i11) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, c1957n);
            if (i9 != c1957n.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, c1957n);
            c2044z3.addLong(c1957n.long1);
        }
        return decodeVarint64;
    }

    public static int mergeGroupField(Object obj, InterfaceC2038y4 interfaceC2038y4, byte[] bArr, int i9, int i10, int i11, C1957n c1957n) throws IOException {
        int parseProto2Message = ((R3) interfaceC2038y4).parseProto2Message(obj, bArr, i9, i10, i11, c1957n);
        c1957n.object1 = obj;
        return parseProto2Message;
    }

    public static int mergeMessageField(Object obj, InterfaceC2038y4 interfaceC2038y4, byte[] bArr, int i9, int i10, C1957n c1957n) throws IOException {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = decodeVarint32(i12, bArr, i11, c1957n);
            i12 = c1957n.int1;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            interfaceC2038y4.mergeFrom(obj, bArr, i13, i14, c1957n);
            c1957n.object1 = obj;
            return i14;
        }
        throw C1912g3.truncatedMessage();
    }

    public static int skipField(int i9, byte[] bArr, int i10, int i11, C1957n c1957n) throws C1912g3 {
        if (Y5.getTagFieldNumber(i9) != 0) {
            int tagWireType = Y5.getTagWireType(i9);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i10 + 4;
                            }
                            throw C1912g3.invalidTag();
                        }
                        int i12 = (i9 & (-8)) | 4;
                        int i13 = 0;
                        while (i10 < i11) {
                            i10 = decodeVarint32(bArr, i10, c1957n);
                            i13 = c1957n.int1;
                            if (i13 == i12) {
                                break;
                            }
                            i10 = skipField(i13, bArr, i10, i11, c1957n);
                        }
                        if (i10 <= i11 && i13 == i12) {
                            return i10;
                        }
                        throw C1912g3.parseFailure();
                    }
                    return decodeVarint32(bArr, i10, c1957n) + c1957n.int1;
                }
                return i10 + 8;
            }
            return decodeVarint64(bArr, i10, c1957n);
        }
        throw C1912g3.invalidTag();
    }

    public static int decodeVarint32(int i9, byte[] bArr, int i10, C1957n c1957n) {
        int i11 = i9 & 127;
        int i12 = i10 + 1;
        byte b = bArr[i10];
        if (b >= 0) {
            c1957n.int1 = i11 | (b << 7);
            return i12;
        }
        int i13 = i11 | ((b & Ascii.DEL) << 7);
        int i14 = i10 + 2;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            c1957n.int1 = i13 | (b8 << Ascii.SO);
            return i14;
        }
        int i15 = i13 | ((b8 & Ascii.DEL) << 14);
        int i16 = i10 + 3;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            c1957n.int1 = i15 | (b9 << Ascii.NAK);
            return i16;
        }
        int i17 = i15 | ((b9 & Ascii.DEL) << 21);
        int i18 = i10 + 4;
        byte b10 = bArr[i16];
        if (b10 >= 0) {
            c1957n.int1 = i17 | (b10 << Ascii.FS);
            return i18;
        }
        int i19 = i17 | ((b10 & Ascii.DEL) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                c1957n.int1 = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int decodeVarint64(long j7, byte[] bArr, int i9, C1957n c1957n) {
        int i10 = i9 + 1;
        byte b = bArr[i9];
        long j9 = (j7 & 127) | ((b & Ascii.DEL) << 7);
        int i11 = 7;
        while (b < 0) {
            int i12 = i10 + 1;
            byte b8 = bArr[i10];
            i11 += 7;
            j9 |= (b8 & Ascii.DEL) << i11;
            i10 = i12;
            b = b8;
        }
        c1957n.long1 = j9;
        return i10;
    }
}
