package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/JsonWriter;", "", "release", "", "write", MimeTypes.BASE_TYPE_TEXT, "", "writeChar", "char", "", "writeLong", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "writeQuoted", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublishedApi
/* loaded from: classes5.dex */
public interface JsonWriter {
    void release();

    void write(String text);

    void writeChar(char r12);

    void writeLong(long value);

    void writeQuoted(String text);
}
