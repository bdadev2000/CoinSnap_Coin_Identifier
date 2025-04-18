package c1;

import androidx.lifecycle.e1;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import ki.b0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import wh.c0;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f2525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Function0 function0, int i10) {
        super(0);
        this.f2524b = i10;
        this.f2525c = function0;
    }

    public final e1 a() {
        int i10 = this.f2524b;
        Function0 function0 = this.f2525c;
        switch (i10) {
            case 1:
                return (e1) function0.invoke();
            case 2:
                return (e1) function0.invoke();
            case 3:
                return (e1) function0.invoke();
            default:
                return (e1) function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f2524b;
        Function0 function0 = this.f2525c;
        switch (i10) {
            case 0:
                File file = (File) function0.invoke();
                if (Intrinsics.areEqual(FilesKt.getExtension(file), "preferences_pb")) {
                    String str = b0.f20952c;
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return c0.j(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                switch (i10) {
                    case 4:
                        function0.invoke();
                        break;
                    default:
                        function0.invoke();
                        break;
                }
                return Unit.INSTANCE;
            case 5:
                switch (i10) {
                    case 4:
                        function0.invoke();
                        break;
                    default:
                        function0.invoke();
                        break;
                }
                return Unit.INSTANCE;
            case 6:
                return a();
            default:
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
        }
    }
}
