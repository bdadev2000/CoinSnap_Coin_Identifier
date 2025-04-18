package l9;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ra.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21277b;

    public /* synthetic */ t(int i10) {
        this.f21277b = i10;
    }

    @Override // ra.j
    public final boolean apply(Object obj) {
        switch (this.f21277b) {
            case 0:
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    return false;
                }
                return true;
            case 1:
                return !(obj instanceof e9.b);
            case 2:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            default:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
        }
    }
}
