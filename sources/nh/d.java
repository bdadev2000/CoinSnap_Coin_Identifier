package nh;

import a6.k;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.q0;
import androidx.lifecycle.x0;
import c6.m;
import com.facebook.internal.i;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import m9.s;
import s2.h;

/* loaded from: classes4.dex */
public final class d extends c1 implements a1 {
    public final /* synthetic */ mh.a a;

    public d(mh.a aVar) {
        this.a = aVar;
    }

    @Override // androidx.lifecycle.a1
    public final x0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class modelClass, k1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (((String) extras.a(m.f2666d)) != null) {
            q0 d10 = jb.g.d(extras);
            final g gVar = new g();
            h hVar = (h) this.a;
            hVar.getClass();
            hVar.f24171d = d10;
            hVar.f24172f = gVar;
            p000if.h hVar2 = (p000if.h) ((e) i.r(e.class, new p000if.h((p000if.f) hVar.f24169b, (p000if.c) hVar.f24170c)));
            hVar2.getClass();
            k.j(10, "expectedSize");
            s sVar = new s(10);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel", hVar2.a);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.main.MainViewModel", hVar2.f19635b);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel", hVar2.f19636c);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyViewModel", hVar2.f19637d);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdViewModel", hVar2.f19638e);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel", hVar2.f19639f);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel", hVar2.f19640g);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel", hVar2.f19641h);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultViewModel", hVar2.f19642i);
            sVar.c("com.plantcare.ai.identifier.plantid.ui.component.splash.SplashViewModel", hVar2.f19643j);
            rh.a aVar = (rh.a) sVar.a().get(modelClass.getName());
            if (aVar != null) {
                x0 x0Var = (x0) aVar.get();
                x0Var.addCloseable(new Closeable() { // from class: nh.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.this.a();
                    }
                });
                return x0Var;
            }
            throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + modelClass.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.c1
    public final void c(x0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
    }
}
