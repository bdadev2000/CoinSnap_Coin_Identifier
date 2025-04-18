package nf;

import android.os.SystemClock;
import android.view.View;
import com.bumptech.glide.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f22764c;

    public /* synthetic */ a(int i10, Function1 function1) {
        this.f22763b = i10;
        this.f22764c = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        int i10 = this.f22763b;
        Function1 function1 = this.f22764c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(v10, "v");
                if (SystemClock.elapsedRealtime() - e.f9646m >= 300) {
                    function1.invoke(v10);
                    e.f9646m = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(v10, "v");
                if (SystemClock.elapsedRealtime() - e.f9646m >= 1000) {
                    function1.invoke(v10);
                    e.f9646m = SystemClock.elapsedRealtime();
                    return;
                }
                return;
        }
    }
}
