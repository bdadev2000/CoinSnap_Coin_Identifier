package androidx.datastore.core;

import h0.g;
import j0.c;
import j0.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
/* loaded from: classes4.dex */
public final class SingleProcessDataStore$readAndInit$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SingleProcessDataStore f19015a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19016b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f19017c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public SingleProcessDataStore$readAndInit$api$1 f19018f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f19019g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19020h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19021i;

    /* renamed from: j, reason: collision with root package name */
    public int f19022j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$1(SingleProcessDataStore singleProcessDataStore, g gVar) {
        super(gVar);
        this.f19021i = singleProcessDataStore;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19020h = obj;
        this.f19022j |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
        return this.f19021i.d(this);
    }
}
