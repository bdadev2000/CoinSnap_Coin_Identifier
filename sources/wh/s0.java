package wh;

import java.io.File;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class s0 {
    public static final r0 Companion = new r0();

    @JvmStatic
    @JvmName(name = "create")
    public static final s0 create(File file, g0 g0Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new p0(g0Var, file, 0);
    }

    public abstract long contentLength();

    public abstract g0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ki.j jVar);

    @JvmStatic
    @JvmName(name = "create")
    public static final s0 create(String str, g0 g0Var) {
        Companion.getClass();
        return r0.a(str, g0Var);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final s0 create(ki.l lVar, g0 g0Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new p0(g0Var, lVar, 1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final s0 create(g0 g0Var, File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new p0(g0Var, file, 0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final s0 create(g0 g0Var, String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return r0.a(content, g0Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final s0 create(g0 g0Var, ki.l content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new p0(g0Var, content, 1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final s0 create(g0 g0Var, byte[] content) {
        r0 r0Var = Companion;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return r0.c(r0Var, g0Var, content, 0, 12);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final s0 create(g0 g0Var, byte[] content, int i10) {
        r0 r0Var = Companion;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return r0.c(r0Var, g0Var, content, i10, 8);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final s0 create(g0 g0Var, byte[] content, int i10, int i11) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return r0.b(content, g0Var, i10, i11);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final s0 create(byte[] bArr) {
        r0 r0Var = Companion;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return r0.d(r0Var, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final s0 create(byte[] bArr, g0 g0Var) {
        r0 r0Var = Companion;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return r0.d(r0Var, bArr, g0Var, 0, 6);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final s0 create(byte[] bArr, g0 g0Var, int i10) {
        r0 r0Var = Companion;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return r0.d(r0Var, bArr, g0Var, i10, 4);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final s0 create(byte[] bArr, g0 g0Var, int i10, int i11) {
        Companion.getClass();
        return r0.b(bArr, g0Var, i10, i11);
    }
}
