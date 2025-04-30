package com.mbridge.msdk.playercommon.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioCapabilities;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.audio.AudioRendererEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.audio.MediaCodecAudioRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataOutput;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextOutput;
import com.mbridge.msdk.playercommon.exoplayer2.text.TextRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.video.MediaCodecVideoRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    protected static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final long allowedVideoJoiningTimeMs;
    private final Context context;
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final int extensionRendererMode;

    /* loaded from: classes3.dex */
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this(context, 0);
    }

    public AudioProcessor[] buildAudioProcessors() {
        return new AudioProcessor[0];
    }

    public void buildAudioRenderers(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, AudioProcessor[] audioProcessorArr, Handler handler, AudioRendererEventListener audioRendererEventListener, int i9, ArrayList<Renderer> arrayList) {
        String str;
        Class cls;
        int i10;
        int i11;
        arrayList.add(new MediaCodecAudioRenderer(context, MediaCodecSelector.DEFAULT, drmSessionManager, false, handler, audioRendererEventListener, AudioCapabilities.getCapabilities(context), audioProcessorArr));
        if (i9 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i9 == 2) {
            size--;
        }
        try {
            try {
                cls = Handler.class;
                try {
                    i10 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                        str = TAG;
                        try {
                            Log.i(str, "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i10;
                            i10 = size;
                            try {
                                i11 = i10 + 1;
                                arrayList.add(i10, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                                Log.i(str, "Loaded LibflacAudioRenderer.");
                                arrayList.add(i11, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                                Log.i(str, "Loaded FfmpegAudioRenderer.");
                            } catch (Exception e4) {
                                throw new RuntimeException("Error instantiating FLAC extension", e4);
                            }
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = TAG;
                    }
                } catch (ClassNotFoundException unused3) {
                    str = TAG;
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating Opus extension", e9);
            }
        } catch (ClassNotFoundException unused4) {
            str = TAG;
            cls = Handler.class;
        }
        try {
            i11 = i10 + 1;
        } catch (ClassNotFoundException unused5) {
        }
        try {
            try {
                arrayList.add(i10, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                Log.i(str, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused6) {
                i10 = i11;
                i11 = i10;
                arrayList.add(i11, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
                Log.i(str, "Loaded FfmpegAudioRenderer.");
            }
            arrayList.add(i11, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(cls, AudioRendererEventListener.class, AudioProcessor[].class).newInstance(handler, audioRendererEventListener, audioProcessorArr));
            Log.i(str, "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused7) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e10);
        }
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i9, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i9, ArrayList<Renderer> arrayList) {
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i9, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    public void buildVideoRenderers(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, long j7, Handler handler, VideoRendererEventListener videoRendererEventListener, int i9, ArrayList<Renderer> arrayList) {
        arrayList.add(new MediaCodecVideoRenderer(context, MediaCodecSelector.DEFAULT, j7, drmSessionManager, false, handler, videoRendererEventListener, 50));
        if (i9 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i9 == 2) {
            size--;
        }
        try {
            arrayList.add(size, (Renderer) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j7), handler, videoRendererEventListener, 50));
            Log.i(TAG, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating VP9 extension", e4);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager2;
        if (drmSessionManager == null) {
            drmSessionManager2 = this.drmSessionManager;
        } else {
            drmSessionManager2 = drmSessionManager;
        }
        ArrayList<Renderer> arrayList = new ArrayList<>();
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager3 = drmSessionManager2;
        buildVideoRenderers(this.context, drmSessionManager3, this.allowedVideoJoiningTimeMs, handler, videoRendererEventListener, this.extensionRendererMode, arrayList);
        buildAudioRenderers(this.context, drmSessionManager3, buildAudioProcessors(), handler, audioRendererEventListener, this.extensionRendererMode, arrayList);
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[arrayList.size()]);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        this(context, drmSessionManager, 0);
    }

    public DefaultRenderersFactory(Context context, int i9) {
        this(context, null, i9, DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i9) {
        this(context, drmSessionManager, i9, DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public DefaultRenderersFactory(Context context, int i9, long j7) {
        this(context, null, i9, j7);
    }

    public DefaultRenderersFactory(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, int i9, long j7) {
        this.context = context;
        this.extensionRendererMode = i9;
        this.allowedVideoJoiningTimeMs = j7;
        this.drmSessionManager = drmSessionManager;
    }
}
