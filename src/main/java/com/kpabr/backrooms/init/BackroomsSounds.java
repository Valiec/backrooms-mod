package com.kpabr.backrooms.init;

import net.minecraft.sound.SoundEvent;

import static com.kpabr.backrooms.util.RegistryHelper.get;

public class BackroomsSounds {
    public static SoundEvent FIRESALT_LAND_EVENT;
    public static SoundEvent HUMBUZZ_LEVEL_0;

    public static SoundEvent HOUND_IDLE;
    public static SoundEvent HOUND_ATTACK;
    public static SoundEvent HOUND_HURT;
    public static SoundEvent HOUND_DEATH;
    public static SoundEvent BLOCK_PIPE_BREAK;
    public static SoundEvent BLOCK_PIPE_STEP;
    public static SoundEvent BLOCK_PIPE_PLACE;
    public static SoundEvent BLOCK_PIPE_HIT;
    public static SoundEvent BLOCK_PIPE_FALL;
    public static SoundEvent BLOCK_PIPE_CRACK;

    public static void init() {
        HUMBUZZ_LEVEL_0 = get("humbuzz");
        FIRESALT_LAND_EVENT = get("firesalt_land");
        BLOCK_PIPE_BREAK = get("block.pipe.break");
        BLOCK_PIPE_STEP = get("block.pipe.step");
        BLOCK_PIPE_PLACE = get("block.pipe.place");
        BLOCK_PIPE_HIT = get("block.pipe.hit");
        BLOCK_PIPE_FALL = get("block.pipe.fall");
        BLOCK_PIPE_CRACK = get("block.pipe.crack");
        initHoundSounds();
    }

    private static void initHoundSounds() {
        HOUND_IDLE = get("entity.hound.idle");
        HOUND_ATTACK = get("entity.hound.attack");
        HOUND_HURT = get("entity.hound.hurt");
        HOUND_DEATH = get("entity.hound.death");
    }
}