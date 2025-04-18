package androidx.loader.app;

import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class LoaderManagerImpl extends LoaderManager {

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f20248a;

    /* renamed from: b, reason: collision with root package name */
    public final LoaderViewModel f20249b;

    /* loaded from: classes2.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        @Override // androidx.lifecycle.LiveData
        public final void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void f() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void g(Observer observer) {
            super.g(observer);
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public final void h(Object obj) {
            super.h(obj);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            DebugUtils.a(sb, null);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class LoaderObserver<D> implements Observer<D> {
        @Override // androidx.lifecycle.Observer
        public final void a(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class LoaderViewModel extends ViewModel {

        /* renamed from: c, reason: collision with root package name */
        public static final ViewModelProvider.Factory f20250c = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final SparseArrayCompat f20251b = new SparseArrayCompat();

        /* renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static class AnonymousClass1 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final ViewModel create(Class cls) {
                return new LoaderViewModel();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            SparseArrayCompat sparseArrayCompat = this.f20251b;
            if (sparseArrayCompat.g() > 0) {
                ((LoaderInfo) sparseArrayCompat.h(0)).getClass();
                throw null;
            }
            int i2 = sparseArrayCompat.d;
            Object[] objArr = sparseArrayCompat.f1611c;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            sparseArrayCompat.d = 0;
            sparseArrayCompat.f1609a = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f20248a = lifecycleOwner;
        this.f20249b = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.f20250c).a(LoaderViewModel.class);
    }

    @Override // androidx.loader.app.LoaderManager
    public final void a(String str, PrintWriter printWriter) {
        SparseArrayCompat sparseArrayCompat = this.f20249b.f20251b;
        if (sparseArrayCompat.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (sparseArrayCompat.g() <= 0) {
                return;
            }
            LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.h(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(sparseArrayCompat.d(0));
            printWriter.print(": ");
            printWriter.println(loaderInfo.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final void c() {
        SparseArrayCompat sparseArrayCompat = this.f20249b.f20251b;
        int g2 = sparseArrayCompat.g();
        for (int i2 = 0; i2 < g2; i2++) {
            ((LoaderInfo) sparseArrayCompat.h(i2)).getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.a(sb, this.f20248a);
        sb.append("}}");
        return sb.toString();
    }
}
