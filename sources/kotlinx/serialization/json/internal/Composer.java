package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0012J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0013H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0015H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0017H\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "writer", "Lkotlinx/serialization/json/internal/JsonWriter;", "(Lkotlinx/serialization/json/internal/JsonWriter;)V", "<set-?>", "", "writingFirst", "getWritingFirst", "()Z", "setWritingFirst", "(Z)V", "indent", "", "nextItem", "print", "v", "", "", "", "", "", "", "", "", "printQuoted", AppMeasurementSdk.ConditionalUserProperty.VALUE, "space", "unIndent", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class Composer {

    @JvmField
    public final JsonWriter writer;
    private boolean writingFirst;

    public Composer(JsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void indent() {
        this.writingFirst = true;
    }

    public void nextItem() {
        this.writingFirst = false;
    }

    public final void print(char v10) {
        this.writer.writeChar(v10);
    }

    public final void printQuoted(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.writeQuoted(value);
    }

    public final void setWritingFirst(boolean z10) {
        this.writingFirst = z10;
    }

    public void space() {
    }

    public void unIndent() {
    }

    public final void print(String v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.writer.write(v10);
    }

    public void print(float v10) {
        this.writer.write(String.valueOf(v10));
    }

    public void print(double v10) {
        this.writer.write(String.valueOf(v10));
    }

    public void print(byte v10) {
        this.writer.writeLong(v10);
    }

    public void print(short v10) {
        this.writer.writeLong(v10);
    }

    public void print(int v10) {
        this.writer.writeLong(v10);
    }

    public void print(long v10) {
        this.writer.writeLong(v10);
    }

    public void print(boolean v10) {
        this.writer.write(String.valueOf(v10));
    }
}
