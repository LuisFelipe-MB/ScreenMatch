package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int seasons;
    private int seasonEpisode;
    private boolean active;
    private int minutesEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getSeasonEpisode() {
        return seasonEpisode;
    }

    public void setSeasonEpisode(int seasonEpisode) {
        this.seasonEpisode = seasonEpisode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * seasonEpisode * minutesEpisode;
    }
}
