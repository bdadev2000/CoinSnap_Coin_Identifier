package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;

/* loaded from: classes2.dex */
public class ViewModelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelProviderImpl f20125a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public interface Factory {

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        default ViewModel create(Class cls) {
            p0.a.s(cls, "modelClass");
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default ViewModel create(Class cls, CreationExtras creationExtras) {
            p0.a.s(cls, "modelClass");
            p0.a.s(creationExtras, "extras");
            return create(cls);
        }

        default ViewModel create(x0.c cVar, CreationExtras creationExtras) {
            p0.a.s(cVar, "modelClass");
            p0.a.s(creationExtras, "extras");
            return create(p0.a.i0(cVar), creationExtras);
        }
    }

    /* loaded from: classes2.dex */
    public static class NewInstanceFactory implements Factory {

        /* renamed from: a, reason: collision with root package name */
        public static NewInstanceFactory f20128a;

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            p0.a.s(cls, "modelClass");
            return JvmViewModelProviders.a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras creationExtras) {
            p0.a.s(cls, "modelClass");
            p0.a.s(creationExtras, "extras");
            return create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(x0.c cVar, CreationExtras creationExtras) {
            p0.a.s(cVar, "modelClass");
            p0.a.s(creationExtras, "extras");
            return create(p0.a.i0(cVar), creationExtras);
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class OnRequeryFactory {
        public void a(ViewModel viewModel) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, 0);
        p0.a.s(viewModelStore, "store");
        p0.a.s(factory, "factory");
    }

    public final ViewModel a(Class cls) {
        return c(g0.a(cls));
    }

    public final ViewModel b(Class cls, String str) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        return this.f20125a.a(str, g0.a(cls));
    }

    public final ViewModel c(x0.c cVar) {
        p0.a.s(cVar, "modelClass");
        String b2 = ((j) cVar).b();
        if (b2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return this.f20125a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2), cVar);
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, int i2) {
        this(viewModelStore, factory, CreationExtras.Empty.f20236b);
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        p0.a.s(viewModelStore, "store");
        p0.a.s(factory, "factory");
        p0.a.s(creationExtras, "defaultCreationExtras");
        this.f20125a = new ViewModelProviderImpl(viewModelStore, factory, creationExtras);
    }

    /* loaded from: classes2.dex */
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* renamed from: c, reason: collision with root package name */
        public static AndroidViewModelFactory f20126c;
        public static final ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1 d = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final Application f20127b;

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        public AndroidViewModelFactory(Application application) {
            this.f20127b = application;
        }

        public final ViewModel a(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                p0.a.r(viewModel, "{\n                try {\n…          }\n            }");
                return viewModel;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(Class cls, CreationExtras creationExtras) {
            p0.a.s(cls, "modelClass");
            p0.a.s(creationExtras, "extras");
            if (this.f20127b != null) {
                return create(cls);
            }
            Application application = (Application) creationExtras.a(d);
            if (application != null) {
                return a(cls, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return JvmViewModelProviders.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(Class cls) {
            p0.a.s(cls, "modelClass");
            Application application = this.f20127b;
            if (application != null) {
                return a(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r3, androidx.lifecycle.ViewModelProvider.Factory r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            p0.a.s(r3, r0)
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L14
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            androidx.lifecycle.viewmodel.CreationExtras r3 = r3.getDefaultViewModelCreationExtras()
            goto L16
        L14:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f20236b
        L16:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.ViewModelProvider$Factory):void");
    }
}
