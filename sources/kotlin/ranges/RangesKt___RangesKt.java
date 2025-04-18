package kotlin.ranges;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\tH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020**\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\f\u0010+\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u0010+\u001a\u00020\b*\u00020'H\u0007\u001a\f\u0010+\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u00100\u001a\u00020\b*\u00020'H\u0007\u001a\f\u00100\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u00101\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u00101\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u00101\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\r\u00102\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u00102\u001a\u00020\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u00102\u001a\u00020\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u00102\u001a\u00020\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007\u001a\u0014\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u00105\u001a\u001b\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00106\u001a\u0014\u00104\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u00107\u001a\u001b\u00104\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00108\u001a\u0014\u00104\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00109\u001a\u001b\u00104\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u0010:\u001a\n\u0010;\u001a\u00020**\u00020*\u001a\n\u0010;\u001a\u00020'*\u00020'\u001a\n\u0010;\u001a\u00020)*\u00020)\u001a\u0015\u0010<\u001a\u00020**\u00020*2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020'*\u00020'2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020)*\u00020)2\u0006\u0010<\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010B\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010H\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010I\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010K\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010L\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010M\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010N\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020\u0016*\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004¨\u0006P"}, d2 = {"coerceAtLeast", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "Lkotlin/ranges/OpenEndRange;", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "first", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes4.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d10);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b3, byte b10) {
        return b3 < b10 ? b10 : b3;
    }

    public static final byte coerceAtMost(byte b3, byte b10) {
        return b3 > b10 ? b10 : b3;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t5, T t10, T t11) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        if (t10 != null && t11 != null) {
            if (t10.compareTo(t11) <= 0) {
                if (t5.compareTo(t10) < 0) {
                    return t10;
                }
                if (t5.compareTo(t11) > 0) {
                    return t11;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t11 + " is less than minimum " + t10 + '.');
            }
        } else {
            if (t10 != null && t5.compareTo(t10) < 0) {
                return t10;
            }
            if (t11 != null && t5.compareTo(t11) > 0) {
                return t11;
            }
        }
        return t5;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b3));
    }

    public static final IntProgression downTo(int i10, byte b3) {
        return IntProgression.INSTANCE.fromClosedRange(i10, b3, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Integer firstOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b3));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, byte b3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b3));
    }

    @SinceKotlin(version = "1.7")
    public static final int last(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Integer lastOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, byte b3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b3));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return random(intRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return randomOrNull(intRange, Random.INSTANCE);
    }

    public static final IntProgression reversed(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, byte b3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b3));
    }

    public static IntProgression step(IntProgression intProgression, int i10) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.fromClosedRange(first, last, i10);
    }

    public static final Byte toByteExactOrNull(int i10) {
        if (new IntRange(-128, 127).contains(i10)) {
            return Byte.valueOf((byte) i10);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j3) {
        if (new LongRange(-2147483648L, 2147483647L).contains(j3)) {
            return Integer.valueOf((int) j3);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d10) {
        boolean z10 = false;
        if (-9.223372036854776E18d <= d10 && d10 <= 9.223372036854776E18d) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf((long) d10);
        }
        return null;
    }

    public static final Short toShortExactOrNull(int i10) {
        if (new IntRange(-32768, 32767).contains(i10)) {
            return Short.valueOf((short) i10);
        }
        return null;
    }

    public static final IntRange until(int i10, byte b3) {
        return new IntRange(i10, b3 - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f10);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static final double coerceAtMost(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l10) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l10 != null && longRange.contains(l10.longValue());
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange<Double> closedRange, float f10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f10));
    }

    public static final LongProgression downTo(long j3, byte b3) {
        return LongProgression.INSTANCE.fromClosedRange(j3, b3, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final Long firstOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange<Float> closedRange, double d10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d10));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, byte b3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b3));
    }

    @SinceKotlin(version = "1.7")
    public static final Long lastOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, byte b3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b3));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return random(longRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return randomOrNull(longRange, Random.INSTANCE);
    }

    public static final LongProgression reversed(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, byte b3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b3));
    }

    public static final Byte toByteExactOrNull(long j3) {
        if (new LongRange(-128L, 127L).contains(j3)) {
            return Byte.valueOf((byte) j3);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d10) {
        boolean z10 = false;
        if (-2.147483648E9d <= d10 && d10 <= 2.147483647E9d) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) d10);
        }
        return null;
    }

    public static final Long toLongExactOrNull(float f10) {
        boolean z10 = false;
        if (-9.223372E18f <= f10 && f10 <= 9.223372E18f) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf(f10);
        }
        return null;
    }

    public static final Short toShortExactOrNull(long j3) {
        if (new LongRange(-32768L, 32767L).contains(j3)) {
            return Short.valueOf((short) j3);
        }
        return null;
    }

    public static final LongRange until(long j3, byte b3) {
        return new LongRange(j3, b3 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final float coerceAtLeast(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final float coerceAtMost(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch2) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch2 != null && charRange.contains(ch2.charValue());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(OpenEndRange<Double> openEndRange, float f10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f10));
    }

    public static final IntProgression downTo(byte b3, byte b10) {
        return IntProgression.INSTANCE.fromClosedRange(b3, b10, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final Character firstOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i10));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d10);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final Character lastOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d10);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return random(charRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return randomOrNull(charRange, Random.INSTANCE);
    }

    public static final CharProgression reversed(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d10);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final LongProgression step(LongProgression longProgression, long j3) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j3 > 0, Long.valueOf(j3));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j3 = -j3;
        }
        return companion.fromClosedRange(first, last, j3);
    }

    public static final Byte toByteExactOrNull(short s5) {
        if (intRangeContains((ClosedRange<Integer>) new IntRange(-128, 127), s5)) {
            return Byte.valueOf((byte) s5);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(float f10) {
        boolean z10 = false;
        if (-2.1474836E9f <= f10 && f10 <= 2.1474836E9f) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) f10);
        }
        return null;
    }

    public static final Short toShortExactOrNull(double d10) {
        boolean z10 = false;
        if (-32768.0d <= d10 && d10 <= 32767.0d) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) d10);
        }
        return null;
    }

    public static final IntRange until(byte b3, byte b10) {
        return new IntRange(b3, b10 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i10);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static int coerceAtMost(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b3) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, b3);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i10));
    }

    public static final IntProgression downTo(short s5, byte b3) {
        return IntProgression.INSTANCE.fromClosedRange(s5, b3, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) j3));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f10);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f10);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer randomOrNull(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f10);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final Byte toByteExactOrNull(double d10) {
        boolean z10 = false;
        if (-128.0d <= d10 && d10 <= 127.0d) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) d10);
        }
        return null;
    }

    public static final Short toShortExactOrNull(float f10) {
        boolean z10 = false;
        if (-32768.0f <= f10 && f10 <= 32767.0f) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) f10);
        }
        return null;
    }

    public static final IntRange until(short s5, byte b3) {
        return new IntRange(s5, b3 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, long j3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j3);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j3, long j10) {
        return j3 < j10 ? j10 : j3;
    }

    public static long coerceAtMost(long j3, long j10) {
        return j3 > j10 ? j10 : j3;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b3) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, b3);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j3));
    }

    public static final CharProgression downTo(char c10, char c11) {
        return CharProgression.INSTANCE.fromClosedRange(c10, c11, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s5));
    }

    @JvmName(name = "intRangeContains")
    public static boolean intRangeContains(ClosedRange<Integer> closedRange, long j3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j3);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i10));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, int i10) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final CharProgression step(CharProgression charProgression, int i10) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.fromClosedRange(first, last, i10);
    }

    public static final Byte toByteExactOrNull(float f10) {
        boolean z10 = false;
        if (-128.0f <= f10 && f10 <= 127.0f) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) f10);
        }
        return null;
    }

    public static final CharRange until(char c10, char c11) {
        return Intrinsics.compare((int) c11, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c10, (char) (c11 - 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, long j3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j3);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s5, short s10) {
        return s5 < s10 ? s10 : s5;
    }

    public static final short coerceAtMost(short s5, short s10) {
        return s5 > s10 ? s10 : s5;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i10) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, i10);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s5));
    }

    public static IntProgression downTo(int i10, int i11) {
        return IntProgression.INSTANCE.fromClosedRange(i10, i11, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, long j3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j3);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i10));
    }

    @SinceKotlin(version = "1.3")
    public static final long random(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long randomOrNull(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, int i10) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i10);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, short s5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s5);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t5, T minimumValue) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t5.compareTo(minimumValue) < 0 ? minimumValue : t5;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t5, T maximumValue) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t5.compareTo(maximumValue) > 0 ? maximumValue : t5;
    }

    public static final byte coerceIn(byte b3, byte b10, byte b11) {
        if (b10 <= b11) {
            return b3 < b10 ? b10 : b3 > b11 ? b11 : b3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b11) + " is less than minimum " + ((int) b10) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j3) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, j3);
    }

    public static final LongProgression downTo(long j3, int i10) {
        return LongProgression.INSTANCE.fromClosedRange(j3, i10, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, short s5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s5));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, short s5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s5));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, long j3) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j3);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static IntRange until(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i10, i11 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, short s5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s5);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s5, short s10, short s11) {
        if (s10 <= s11) {
            return s5 < s10 ? s10 : s5 > s11 ? s11 : s5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s11) + " is less than minimum " + ((int) s10) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s5) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, s5);
    }

    public static final IntProgression downTo(byte b3, int i10) {
        return IntProgression.INSTANCE.fromClosedRange(b3, i10, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, short s5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s5));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, short s5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s5));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character randomOrNull(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, long j3) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j3);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s5) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, s5);
    }

    public static final IntProgression downTo(short s5, int i10) {
        return IntProgression.INSTANCE.fromClosedRange(s5, i10, -1);
    }

    public static final LongRange until(long j3, int i10) {
        return new LongRange(j3, i10 - 1);
    }

    public static long coerceIn(long j3, long j10, long j11) {
        if (j10 <= j11) {
            return j3 < j10 ? j10 : j3 > j11 ? j11 : j3;
        }
        StringBuilder o10 = a.o("Cannot coerce value to an empty range: maximum ", j11, " is less than minimum ");
        o10.append(j10);
        o10.append('.');
        throw new IllegalArgumentException(o10.toString());
    }

    public static final LongProgression downTo(int i10, long j3) {
        return LongProgression.INSTANCE.fromClosedRange(i10, j3, -1L);
    }

    public static final IntRange until(byte b3, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b3, i10 - 1);
    }

    public static final LongProgression downTo(long j3, long j10) {
        return LongProgression.INSTANCE.fromClosedRange(j3, j10, -1L);
    }

    public static final LongProgression downTo(byte b3, long j3) {
        return LongProgression.INSTANCE.fromClosedRange(b3, j3, -1L);
    }

    public static final IntRange until(short s5, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s5, i10 - 1);
    }

    public static final LongProgression downTo(short s5, long j3) {
        return LongProgression.INSTANCE.fromClosedRange(s5, j3, -1L);
    }

    public static final IntProgression downTo(int i10, short s5) {
        return IntProgression.INSTANCE.fromClosedRange(i10, s5, -1);
    }

    public static final LongRange until(int i10, long j3) {
        if (j3 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i10, j3 - 1);
    }

    public static final LongProgression downTo(long j3, short s5) {
        return LongProgression.INSTANCE.fromClosedRange(j3, s5, -1L);
    }

    public static final IntProgression downTo(byte b3, short s5) {
        return IntProgression.INSTANCE.fromClosedRange(b3, s5, -1);
    }

    public static final LongRange until(long j3, long j10) {
        if (j10 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j3, j10 - 1);
    }

    public static final float coerceIn(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final IntProgression downTo(short s5, short s10) {
        return IntProgression.INSTANCE.fromClosedRange(s5, s10, -1);
    }

    public static final double coerceIn(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final LongRange until(byte b3, long j3) {
        if (j3 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b3, j3 - 1);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T coerceIn(T t5, ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t5, range.getStart()) || range.lessThanOrEquals(range.getStart(), t5)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t5) || range.lessThanOrEquals(t5, range.getEndInclusive())) ? t5 : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final LongRange until(short s5, long j3) {
        if (j3 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s5, j3 - 1);
    }

    public static final IntRange until(int i10, short s5) {
        return new IntRange(i10, s5 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t5, ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t5, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t5, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return t5.compareTo(range.getStart()) < 0 ? range.getStart() : t5.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : t5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final LongRange until(long j3, short s5) {
        return new LongRange(j3, s5 - 1);
    }

    public static final IntRange until(byte b3, short s5) {
        return new IntRange(b3, s5 - 1);
    }

    public static final IntRange until(short s5, short s10) {
        return new IntRange(s5, s10 - 1);
    }

    public static final int coerceIn(int i10, ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i10), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < range.getStart().intValue() ? range.getStart().intValue() : i10 > range.getEndInclusive().intValue() ? range.getEndInclusive().intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long coerceIn(long j3, ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j3), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j3 < range.getStart().longValue() ? range.getStart().longValue() : j3 > range.getEndInclusive().longValue() ? range.getEndInclusive().longValue() : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
