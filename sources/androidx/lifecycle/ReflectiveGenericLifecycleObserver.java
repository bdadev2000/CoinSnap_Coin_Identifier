package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes4.dex */
public class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20061a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassesInfoCache.CallbackInfo f20062b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f20061a = obj;
        ClassesInfoCache classesInfoCache = ClassesInfoCache.f19936c;
        Class<?> cls = obj.getClass();
        ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.f19937a.get(cls);
        this.f20062b = callbackInfo == null ? classesInfoCache.a(cls, null) : callbackInfo;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        HashMap hashMap = this.f20062b.f19939a;
        List list = (List) hashMap.get(event);
        Object obj = this.f20061a;
        ClassesInfoCache.CallbackInfo.a(list, lifecycleOwner, event, obj);
        ClassesInfoCache.CallbackInfo.a((List) hashMap.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }
}
