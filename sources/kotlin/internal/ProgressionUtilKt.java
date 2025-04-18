package kotlin.internal;

import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, a.a, "", "getProgressionLastElement", "start", TtmlNode.END, "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i10, int i11, int i12) {
        return mod(mod(i10, i12) - mod(i11, i12), i12);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - differenceModulo(i11, i10, i12);
        }
        if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + differenceModulo(i10, i11, -i12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int mod(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    private static final long differenceModulo(long j3, long j10, long j11) {
        return mod(mod(j3, j11) - mod(j10, j11), j11);
    }

    private static final long mod(long j3, long j10) {
        long j11 = j3 % j10;
        return j11 >= 0 ? j11 : j11 + j10;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j3, long j10, long j11) {
        if (j11 > 0) {
            return j3 >= j10 ? j10 : j10 - differenceModulo(j10, j3, j11);
        }
        if (j11 < 0) {
            return j3 <= j10 ? j10 : j10 + differenceModulo(j3, j10, -j11);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
