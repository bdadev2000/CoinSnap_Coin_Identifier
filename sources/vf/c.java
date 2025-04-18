package vf;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f26526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ComponentActivity componentActivity, int i10) {
        super(0);
        this.f26525b = i10;
        this.f26526c = componentActivity;
    }

    public final a1 a() {
        int i10 = this.f26525b;
        ComponentActivity componentActivity = this.f26526c;
        switch (i10) {
            case 0:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            default:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 2:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 4:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 6:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 8:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 10:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 12:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 14:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 16:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 18:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 20:
                return componentActivity.getDefaultViewModelProviderFactory();
            case 22:
                return componentActivity.getDefaultViewModelProviderFactory();
        }
    }

    public final d1 b() {
        int i10 = this.f26525b;
        ComponentActivity componentActivity = this.f26526c;
        switch (i10) {
            case 1:
                return componentActivity.getViewModelStore();
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            default:
                return componentActivity.getViewModelStore();
            case 3:
                return componentActivity.getViewModelStore();
            case 5:
                return componentActivity.getViewModelStore();
            case 7:
                return componentActivity.getViewModelStore();
            case 9:
                return componentActivity.getViewModelStore();
            case 11:
                return componentActivity.getViewModelStore();
            case 13:
                return componentActivity.getViewModelStore();
            case 15:
                return componentActivity.getViewModelStore();
            case 17:
                return componentActivity.getViewModelStore();
            case 19:
                return componentActivity.getViewModelStore();
            case 21:
                return componentActivity.getViewModelStore();
            case 23:
                return componentActivity.getViewModelStore();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f26525b) {
            case 0:
                return a();
            case 1:
                return b();
            case 2:
                return a();
            case 3:
                return b();
            case 4:
                return a();
            case 5:
                return b();
            case 6:
                return a();
            case 7:
                return b();
            case 8:
                return a();
            case 9:
                return b();
            case 10:
                return a();
            case 11:
                return b();
            case 12:
                return a();
            case 13:
                return b();
            case 14:
                return a();
            case 15:
                return b();
            case 16:
                return a();
            case 17:
                return b();
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                return a();
            case 21:
                return b();
            case 22:
                return a();
            case 23:
                return b();
            case 24:
                return a();
            default:
                return b();
        }
    }
}
