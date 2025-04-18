package kotlin.collections;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", TtmlNode.LEFT, TtmlNode.RIGHT, "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m600partitionnroSd4(long[] jArr, int i10, int i11) {
        long j3;
        long m379getsVKNKU = ULongArray.m379getsVKNKU(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                j3 = m379getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m379getsVKNKU(jArr, i10) ^ Long.MIN_VALUE, j3) >= 0) {
                    break;
                }
                i10++;
            }
            while (Long.compare(ULongArray.m379getsVKNKU(jArr, i11) ^ Long.MIN_VALUE, j3) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long m379getsVKNKU2 = ULongArray.m379getsVKNKU(jArr, i10);
                ULongArray.m384setk8EXiF4(jArr, i10, ULongArray.m379getsVKNKU(jArr, i11));
                ULongArray.m384setk8EXiF4(jArr, i11, m379getsVKNKU2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m601partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte m221getw2LRezQ = UByteArray.m221getw2LRezQ(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m221getw2LRezQ2 = UByteArray.m221getw2LRezQ(bArr, i10) & UByte.MAX_VALUE;
                i12 = m221getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m221getw2LRezQ2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UByteArray.m221getw2LRezQ(bArr, i11) & UByte.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte m221getw2LRezQ3 = UByteArray.m221getw2LRezQ(bArr, i10);
                UByteArray.m226setVurrAj0(bArr, i10, UByteArray.m221getw2LRezQ(bArr, i11));
                UByteArray.m226setVurrAj0(bArr, i11, m221getw2LRezQ3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m602partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short m484getMh2AYeg = UShortArray.m484getMh2AYeg(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m484getMh2AYeg2 = UShortArray.m484getMh2AYeg(sArr, i10) & UShort.MAX_VALUE;
                i12 = m484getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m484getMh2AYeg2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UShortArray.m484getMh2AYeg(sArr, i11) & UShort.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short m484getMh2AYeg3 = UShortArray.m484getMh2AYeg(sArr, i10);
                UShortArray.m489set01HTLdE(sArr, i10, UShortArray.m484getMh2AYeg(sArr, i11));
                UShortArray.m489set01HTLdE(sArr, i11, m484getMh2AYeg3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m603partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int i12;
        int m300getpVg5ArA = UIntArray.m300getpVg5ArA(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = m300getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m300getpVg5ArA(iArr, i10) ^ Integer.MIN_VALUE, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Integer.compare(UIntArray.m300getpVg5ArA(iArr, i11) ^ Integer.MIN_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int m300getpVg5ArA2 = UIntArray.m300getpVg5ArA(iArr, i10);
                UIntArray.m305setVXSXFK8(iArr, i10, UIntArray.m300getpVg5ArA(iArr, i11));
                UIntArray.m305setVXSXFK8(iArr, i11, m300getpVg5ArA2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m604quickSortnroSd4(long[] jArr, int i10, int i11) {
        int m600partitionnroSd4 = m600partitionnroSd4(jArr, i10, i11);
        int i12 = m600partitionnroSd4 - 1;
        if (i10 < i12) {
            m604quickSortnroSd4(jArr, i10, i12);
        }
        if (m600partitionnroSd4 < i11) {
            m604quickSortnroSd4(jArr, m600partitionnroSd4, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m605quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int m601partition4UcCI2c = m601partition4UcCI2c(bArr, i10, i11);
        int i12 = m601partition4UcCI2c - 1;
        if (i10 < i12) {
            m605quickSort4UcCI2c(bArr, i10, i12);
        }
        if (m601partition4UcCI2c < i11) {
            m605quickSort4UcCI2c(bArr, m601partition4UcCI2c, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m606quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int m602partitionAa5vz7o = m602partitionAa5vz7o(sArr, i10, i11);
        int i12 = m602partitionAa5vz7o - 1;
        if (i10 < i12) {
            m606quickSortAa5vz7o(sArr, i10, i12);
        }
        if (m602partitionAa5vz7o < i11) {
            m606quickSortAa5vz7o(sArr, m602partitionAa5vz7o, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m607quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int m603partitionoBK06Vg = m603partitionoBK06Vg(iArr, i10, i11);
        int i12 = m603partitionoBK06Vg - 1;
        if (i10 < i12) {
            m607quickSortoBK06Vg(iArr, i10, i12);
        }
        if (m603partitionoBK06Vg < i11) {
            m607quickSortoBK06Vg(iArr, m603partitionoBK06Vg, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m608sortArraynroSd4(long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m604quickSortnroSd4(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m609sortArray4UcCI2c(byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m605quickSort4UcCI2c(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m610sortArrayAa5vz7o(short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m606quickSortAa5vz7o(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m611sortArrayoBK06Vg(int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m607quickSortoBK06Vg(array, i10, i11 - 1);
    }
}
