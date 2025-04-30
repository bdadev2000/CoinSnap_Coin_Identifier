package h0;

import G7.k;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import u7.C2824o;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315e extends k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F7.a f20574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2315e(F7.a aVar, int i9) {
        super(0);
        this.b = i9;
        this.f20574c = aVar;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                File file = (File) this.f20574c.invoke();
                G7.j.e(file, "<this>");
                String name = file.getName();
                G7.j.d(name, "getName(...)");
                if (O7.g.Y(name, "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                try {
                    return (List) this.f20574c.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C2824o.b;
                }
        }
    }
}
