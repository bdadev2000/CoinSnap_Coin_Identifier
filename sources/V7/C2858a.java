package v7;

import G7.j;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;

/* renamed from: v7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2858a implements Comparator {

    /* renamed from: c, reason: collision with root package name */
    public static final C2858a f23642c = new C2858a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C2858a f23643d = new C2858a(1);
    public final /* synthetic */ int b;

    public /* synthetic */ C2858a(int i9) {
        this.b = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                j.e(comparable, "a");
                j.e(comparable2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                j.e(comparable3, "a");
                j.e(comparable4, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.b) {
            case 0:
                return f23643d;
            default:
                return f23642c;
        }
    }
}
