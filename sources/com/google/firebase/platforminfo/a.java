package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28904c;

    public /* synthetic */ a(String str, Object obj, int i2) {
        this.f28902a = i2;
        this.f28903b = str;
        this.f28904c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i2 = this.f28902a;
        String str = this.f28903b;
        Object obj = this.f28904c;
        switch (i2) {
            case 0:
                return LibraryVersionComponent.a(str, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
            default:
                return ComponentMonitor.a(str, (Component) obj, componentContainer);
        }
    }
}
