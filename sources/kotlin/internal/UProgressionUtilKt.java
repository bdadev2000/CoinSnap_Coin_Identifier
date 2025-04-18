package kotlin.internal;

import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, a.a, "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", TtmlNode.END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1350differenceModuloWZ9TVnA(int i10, int i11, int i12) {
        long j3 = i12 & 4294967295L;
        int i13 = (int) ((i10 & 4294967295L) % j3);
        int i14 = (int) ((i11 & 4294967295L) % j3);
        int compare = Integer.compare(i13 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i14);
        int m240constructorimpl = UInt.m240constructorimpl(i13 - i14);
        if (compare < 0) {
            return UInt.m240constructorimpl(m240constructorimpl + i12);
        }
        return m240constructorimpl;
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1351differenceModulosambcqE(long j3, long j10, long j11) {
        long j12;
        long j13 = 0;
        if (j11 < 0) {
            if ((j3 ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE)) {
                j3 -= j11;
            }
        } else if (j3 >= 0) {
            j3 %= j11;
        } else {
            long j14 = j3 - ((((j3 >>> 1) / j11) << 1) * j11);
            if ((j14 ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE)) {
                j12 = j11;
            } else {
                j12 = 0;
            }
            j3 = j14 - j12;
        }
        if (j11 < 0) {
            if ((j10 ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE)) {
                j10 -= j11;
            }
        } else if (j10 >= 0) {
            j10 %= j11;
        } else {
            long j15 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
            if ((j15 ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE)) {
                j13 = j11;
            }
            j10 = j15 - j13;
        }
        int compare = Long.compare(j3 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
        long m319constructorimpl = ULong.m319constructorimpl(j3 - j10);
        if (compare < 0) {
            return ULong.m319constructorimpl(m319constructorimpl + j11);
        }
        return m319constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1352getProgressionLastElement7ftBX0g(long j3, long j10, long j11) {
        if (j11 > 0) {
            if (Long.compare(j3 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0) {
                return ULong.m319constructorimpl(j10 - m1351differenceModulosambcqE(j10, j3, ULong.m319constructorimpl(j11)));
            }
            return j10;
        }
        if (j11 < 0) {
            if (Long.compare(j3 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) > 0) {
                return ULong.m319constructorimpl(j10 + m1351differenceModulosambcqE(j3, j10, ULong.m319constructorimpl(-j11)));
            }
            return j10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1353getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) < 0) {
                return UInt.m240constructorimpl(i11 - m1350differenceModuloWZ9TVnA(i11, i10, UInt.m240constructorimpl(i12)));
            }
            return i11;
        }
        if (i12 < 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) > 0) {
                return UInt.m240constructorimpl(i11 + m1350differenceModuloWZ9TVnA(i10, i11, UInt.m240constructorimpl(-i12)));
            }
            return i11;
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
