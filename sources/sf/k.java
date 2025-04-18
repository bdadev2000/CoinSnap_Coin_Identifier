package sf;

import android.app.Activity;
import com.plantcare.ai.identifier.plantid.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends mf.c {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f25044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f25044c = activity;
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_loading;
    }

    @Override // mf.c
    public final void c() {
        setCancelable(false);
        e(this.f25044c, 0.4f);
    }
}
