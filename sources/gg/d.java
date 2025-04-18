package gg;

import android.content.Intent;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i10) {
        super(0);
        this.f18465b = eVar;
        this.f18466c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = e.f18467j;
        e eVar = this.f18465b;
        eVar.getClass();
        Intent intent = new Intent(eVar.requireContext(), (Class<?>) PlantIdentifierActivity.class);
        intent.putExtra("KEY_TAB_PLANT_SCAN", this.f18466c);
        eVar.startActivity(intent);
        return Unit.INSTANCE;
    }
}
