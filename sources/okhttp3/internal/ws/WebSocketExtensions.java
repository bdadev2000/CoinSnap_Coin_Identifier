package okhttp3.internal.ws;

import android.support.v4.media.d;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class WebSocketExtensions {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @Nullable
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;

    @Nullable
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        
            if (r7 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
        
            if (r9 == null) goto L34;
         */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v2 */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.internal.ws.WebSocketExtensions parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r22) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketExtensions.Companion.parse(okhttp3.Headers):okhttp3.internal.ws.WebSocketExtensions");
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = webSocketExtensions.perMessageDeflate;
        }
        if ((i2 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i2 & 4) != 0) {
            z3 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i2 & 16) != 0) {
            z4 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z7 = z4;
        if ((i2 & 32) != 0) {
            z5 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z2, num3, z6, num4, z7, z5);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @Nullable
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean z2, @Nullable Integer num, boolean z3, @Nullable Integer num2, boolean z4, boolean z5) {
        return new WebSocketExtensions(z2, num, z3, num2, z4, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && a.g(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && a.g(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z2 = this.perMessageDeflate;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r2 = this.clientNoContextTakeover;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode + i3) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.serverNoContextTakeover;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode2 + i5) * 31;
        boolean z3 = this.unknownValues;
        return i6 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z2) {
        return z2 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.perMessageDeflate);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.clientMaxWindowBits);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.clientNoContextTakeover);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.serverMaxWindowBits);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.serverNoContextTakeover);
        sb.append(", unknownValues=");
        return d.s(sb, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z2, @Nullable Integer num, boolean z3, @Nullable Integer num2, boolean z4, boolean z5) {
        this.perMessageDeflate = z2;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z3;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z4;
        this.unknownValues = z5;
    }

    public /* synthetic */ WebSocketExtensions(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? false : z3, (i2 & 8) == 0 ? num2 : null, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? false : z5);
    }
}
