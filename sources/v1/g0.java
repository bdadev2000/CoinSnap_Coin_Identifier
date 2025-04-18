package v1;

import kotlin.jvm.JvmField;

/* loaded from: classes.dex */
public abstract class g0 {

    @JvmField
    public final int version;

    public g0(int i10) {
        this.version = i10;
    }

    public abstract void createAllTables(z1.a aVar);

    public abstract void dropAllTables(z1.a aVar);

    public abstract void onCreate(z1.a aVar);

    public abstract void onOpen(z1.a aVar);

    public abstract void onPostMigrate(z1.a aVar);

    public abstract void onPreMigrate(z1.a aVar);

    public abstract h0 onValidateSchema(z1.a aVar);
}
