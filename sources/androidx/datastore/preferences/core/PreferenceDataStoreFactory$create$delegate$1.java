package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.jvm.internal.r;
import q0.a;
import z0.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f19095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(a aVar) {
        super(0);
        this.f19095a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        File file = (File) this.f19095a.invoke();
        p0.a.s(file, "<this>");
        String name = file.getName();
        p0.a.r(name, "getName(...)");
        if (p0.a.g(m.u1(name, '.', ""), "preferences_pb")) {
            return file;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
