package okio;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.f;
import e0.u;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.k;
import okio.Options;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes2.dex */
public final class TypedOptions<T> extends f implements RandomAccess {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<T> list;

    @NotNull
    private final Options options;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> TypedOptions<T> of(@NotNull Iterable<? extends T> iterable, @NotNull l lVar) {
            p0.a.s(iterable, "values");
            p0.a.s(lVar, "encode");
            List Z0 = u.Z0(iterable);
            Options.Companion companion = Options.Companion;
            int size = Z0.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i2 = 0; i2 < size; i2++) {
                byteStringArr[i2] = lVar.invoke(Z0.get(i2));
            }
            return new TypedOptions<>(Z0, companion.of(byteStringArr));
        }
    }

    public TypedOptions(@NotNull List<? extends T> list, @NotNull Options options) {
        p0.a.s(list, "list");
        p0.a.s(options, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        this.options = options;
        List<T> Z0 = u.Z0(list);
        this.list = Z0;
        if (Z0.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @NotNull
    public static final <T> TypedOptions<T> of(@NotNull Iterable<? extends T> iterable, @NotNull l lVar) {
        return Companion.of(iterable, lVar);
    }

    @Override // java.util.List
    @NotNull
    public T get(int i2) {
        return this.list.get(i2);
    }

    @NotNull
    public final List<T> getList$okio() {
        return this.list;
    }

    @NotNull
    public final Options getOptions$okio() {
        return this.options;
    }

    @Override // e0.a
    public int getSize() {
        return this.list.size();
    }
}
