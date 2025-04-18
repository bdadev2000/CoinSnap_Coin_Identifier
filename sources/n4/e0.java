package n4;

/* loaded from: classes.dex */
public final class e0 extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public e0() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
