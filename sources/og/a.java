package og;

import android.content.Intent;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewIdentifyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PreviewIdentifyActivity f23318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(PreviewIdentifyActivity previewIdentifyActivity, int i10) {
        super(0);
        this.f23317b = i10;
        this.f23318c = previewIdentifyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23317b) {
            case 0:
                m1767invoke();
                return Unit.INSTANCE;
            default:
                m1767invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1767invoke() {
        int i10 = this.f23317b;
        PreviewIdentifyActivity previewIdentifyActivity = this.f23318c;
        switch (i10) {
            case 0:
                previewIdentifyActivity.finish();
                return;
            default:
                previewIdentifyActivity.startActivity(new Intent(previewIdentifyActivity, (Class<?>) MainActivity.class));
                previewIdentifyActivity.finishAffinity();
                return;
        }
    }
}
