package com.swordfish.libretrodroid;

import com.facebook.internal.NativeProtocol;
import e0.x;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class GLRetroShader {

    @NotNull
    private final Map<String, String> params;
    private final int type;

    public GLRetroShader(int i2, @NotNull Map<String, String> map) {
        p0.a.s(map, NativeProtocol.WEB_DIALOG_PARAMS);
        this.type = i2;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GLRetroShader copy$default(GLRetroShader gLRetroShader, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = gLRetroShader.type;
        }
        if ((i3 & 2) != 0) {
            map = gLRetroShader.params;
        }
        return gLRetroShader.copy(i2, map);
    }

    public final int component1() {
        return this.type;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.params;
    }

    @NotNull
    public final GLRetroShader copy(int i2, @NotNull Map<String, String> map) {
        p0.a.s(map, NativeProtocol.WEB_DIALOG_PARAMS);
        return new GLRetroShader(i2, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GLRetroShader)) {
            return false;
        }
        GLRetroShader gLRetroShader = (GLRetroShader) obj;
        return this.type == gLRetroShader.type && p0.a.g(this.params, gLRetroShader.params);
    }

    @NotNull
    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.params.hashCode() + (Integer.hashCode(this.type) * 31);
    }

    @NotNull
    public String toString() {
        return "GLRetroShader(type=" + this.type + ", params=" + this.params + ')';
    }

    public /* synthetic */ GLRetroShader(int i2, Map map, int i3, k kVar) {
        this(i2, (i3 & 2) != 0 ? x.f30219a : map);
    }
}
